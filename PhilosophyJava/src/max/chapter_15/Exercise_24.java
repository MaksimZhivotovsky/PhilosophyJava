package max.chapter_15;

import java.util.HashMap;
import java.util.Map;

public class Exercise_24 {

	public Exercise_24() {
		ClassTypeCapture<Building> cttl = 
				new ClassTypeCapture<Building>(Building.class);
		System.out.println(cttl.f(new Building()));
		System.out.println(cttl.f(new House()));
		ClassTypeCapture<House> ctt2 =
				new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
		System.out.println();
//		System.out.println(cttl.createNew("Building.class"));
		Building building = new Building();
		System.out.println(cttl.addType("World", Building.class));
		cttl.addType("Max", getClass());
		System.out.println(cttl.getMap());
//		System.out.println(cttl.createNew("max.chapter_15.Exercise_Building.class"));

	}
	
	class Building {}
	class House extends Building {}
	public class ClassTypeCapture<T> {
		Map<String, Class<?>> map = new HashMap<>();
		Class<T> kind;
		public ClassTypeCapture(Class<T> kind) {
			this.kind = kind;
		}
		public boolean f(Object arg) {
			return kind.isInstance(arg);
		}
		public Class<?> addType(String typeName, Class<?> kind) {
			return map.put(typeName, kind);
		}
	    Object createNew(String typeName) {
	        Exception cause = null;
	        if (map.containsKey(typeName)) {
	            try {
	                return map.get(typeName).newInstance();
	            } catch (InstantiationException e) {
	                cause = e;
	            } catch (IllegalAccessException e) {
	                cause = e;
	            }
	        }

	        if (cause != null) {
	            throw new RuntimeException(cause);
	        } else {
	            throw new RuntimeException(String.format("Not found class for %s", typeName));
	        }
	    }
	    public Map<String, Class<?>> getMap() {
	        return map;
	    }
	}
}

package max.chapter_15;

import java.util.ArrayList;
import java.util.List;

public class Exercise_29 {
	
	private List<Holder<Integer>> list = new ArrayList<>();
	
	public Exercise_29() {
		testList(list);
	}

	private <T> void testList(List<Holder<T>> holders) {
		holders.add(null);
//		holders. All method List
	}
	
	private <T> void test(Holder<List<?>> list) {
		list.get();
		T t = (T) list.value;
		list.set(null);
//		list. All method Object
	}
	
	private class Holder<T> {
		private T value;
		public Holder() {}
		public Holder(T val) { value = val; }
		public void set(T val) { value = val; }
		public T get() { return value; }
		public boolean equals(Object obj) {
		return value.equals(obj);
		}
	}
}

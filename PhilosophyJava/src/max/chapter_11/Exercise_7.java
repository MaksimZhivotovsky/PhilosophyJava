package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_7 {

	public Exercise_7() {
		List<Name> names = Arrays.asList(new Name("PETY"),
				new Name("BACA"), new Name("OLA"));
		List<Name> list = new ArrayList<>(names);
		System.out.println("list.names:  " + list);
		List<Name> list2 = list.subList(2, 3);
		System.out.println("list2 = list.subList(2, 3)  " + list2);
		list.addAll(list2);
		System.out.println("list.addAll(list2):  " + list);
		List<Name> copi = new ArrayList<>(list);
		System.out.println("copi = new ArrayList<>(list):  " + copi);
		System.out.println("copi:  " + copi);
		copi.removeAll(list);
		System.out.println("copi.removeAll(list):  " + copi);

	}
	
	private class Name {
		private String name;
		Name(String name) {
			this.name = name;
		}
		public String toString() {
			return name;
		}
	}
} 

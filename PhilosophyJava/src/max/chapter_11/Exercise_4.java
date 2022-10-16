package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_4 {

	public Exercise_4() {
		Generator generator = new Generator();
		String[] names = new String[9];
		for(int i = 0; i < names.length; i++) {
			names[i] = generator.next();
		}
        List<String> arrayAsList = Arrays.asList(names);
        List<String> arrayList = new ArrayList<>(arrayAsList);
        List<String> linkedList = new LinkedList<>(arrayAsList);
        Set<String> hashSet = new HashSet<>(arrayAsList);
        Set<String> linkedHashSet = new LinkedHashSet<>(arrayAsList);
        Set<String> treeSet = new TreeSet<>(arrayAsList);

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
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
	private class Generator {
		private Random random = new Random();
		public Generator() {
		}
		
		public String next() {
			int i = random.nextInt(3);
			switch (i) {
			case 0: return new Name("Doot").toString(); 
			case 1: return new Name("Boond").toString(); 
			case 2: return new Name("Root").toString(); 
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
			
		}
	}
}

package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Exercise_11 {

	public Exercise_11() {
        Collection<String> stringCollection = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        Collection<Integer> integerCollection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collection<Character> charCollection = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        
        IterString iterString = new IterString();
        iterString.colection(stringCollection);
        iterString.colection(integerCollection);
        iterString.colection(charCollection);
	}
	
	private class IterString {
		public <T> void colection(Collection<T> collection) {
			Iterator<T> iterator = collection.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + "  ");
			}
			System.out.println();
		}
	}
}

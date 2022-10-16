package max.chapter_11;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Exercise_2 {

	public Exercise_2() {
		new SimplCollection();
	}
	
	private class SimplCollection {
		public SimplCollection() {
			Collection<Integer> c = new LinkedHashSet<Integer>();
			for(int i = 0; i < 10; i++) {
				c.add(i);
			}
			for(Integer i : c) {
				System.out.print(i + ", ");
			}
		}
	}
}

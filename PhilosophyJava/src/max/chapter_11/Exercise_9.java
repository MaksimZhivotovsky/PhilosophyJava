package max.chapter_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise_9 {

	public Exercise_9() {
		
		Sequence sequence = new Sequence();
		sequence.add(new Exempl("Hello"));
		sequence.add(new Exempl("World"));
		sequence.add(new Exempl("Java"));
		sequence.add(new Exempl("Max"));
		
		Iterator sIterator = sequence;
		while (sIterator.hasNext()) {
			System.out.println(sIterator.next());
		}
		
		
		
	}
	private	class Exempl {
		private String str;
		public Exempl(String str) {
			this.str =str;
		}
		public String toString() {
			return str;
		}
	}
	private class Sequence implements Iterator<Object> {
		private int i;
		private List<Object> items = new ArrayList<Object>();;
		public void add(Object x) {
				items.add(x);
			}
		@Override
		public boolean hasNext() {
			return i < items.size();
		}
		@Override
		public Object next() {
			return items.get(i++);
		}
	}
}

	


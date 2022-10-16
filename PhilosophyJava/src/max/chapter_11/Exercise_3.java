package max.chapter_11;

import java.util.ArrayList;
import java.util.List;

public class Exercise_3 {

	public Exercise_3() {
		Exempl exempl1 = new Exempl("Hello");
		Exempl exempl2 = new Exempl("World");
		Exempl exempl3 = new Exempl("Java");
		String[] exempls = {exempl1.toString(), exempl2.toString(),
				exempl3.toString()
		};
		Sequence sequence = new Sequence();
		sequence.add(exempl1.toString());
		sequence.add(exempl2.toString());
		sequence.add(exempl3.toString());
		sequence.add(new Exempl("Max"));
		sequence.add(new String("errr"));
		sequence.add(new Integer(35));
		sequence.add(exempls);
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
		}
	}
	
	private class Exempl {
		private String str;
		public Exempl(String str) {
			this.str =str;
		}
		public String toString() {
			return str;
		}
	}

	private interface Selector {
		boolean end();
		Object current();
		void next();
	}
	public class Sequence {
		private List<Object> items = new ArrayList<Object>();;

		public void add(Object x) {
				items.add(x);
		}
		private class SequnceSelector implements Selector {

			private int i = 0;
			
			@Override
			public boolean end() {
				return i == items.size();
			}
			@Override
			public Object current() {
				return items.get(i);
			}
			@Override
			public void next() {
				if(i < items.size()) { 
					i++;
				}
			}
		}
		public Selector selector() {
			return new SequnceSelector();
		}
	}
}

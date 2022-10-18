package max.chapter_12;

public class Exercise_12 {

public Exercise_12() {
			Exempl exempl1 = new Exempl("Hello");
			Exempl exempl2 = new Exempl("World");
			Exempl exempl3 = new Exempl("Java");
			Exempl exempl4 = new Exempl("Java");
//			String[] exempls = {exempl1.toString(), exempl2.toString(),
//					exempl3.toString()
//			};
			Sequence sequence = new Sequence(3);
			sequence.add(exempl1.toString());
			sequence.add(exempl2.toString());
			sequence.add(exempl3.toString());
			sequence.add(exempl4.toString());
//			sequence.add(exempls);
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
			private Object[] items;
			private int next = 0;
			public Sequence(int size) {
				items = new Object[size];
			}
			public void add(Object x) {
				if(next < items.length) {
					items[next++] = x;
				} else {
					throw new ArrayIndexOutOfBoundsException("Many Objects");
				}
			}
			private class SequnceSelector implements Selector {

				private int i = 0;
				
				@Override
				public boolean end() {
					return i == items.length;
				}
				@Override
				public Object current() {
					return items[i];
				}
				@Override
				public void next() {
					if(i < items.length) { 
						i++;
					}
				}
			}
			public Selector selector() {
				return new SequnceSelector();
			}
		}
}

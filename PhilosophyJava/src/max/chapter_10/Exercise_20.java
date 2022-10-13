package max.chapter_10;

public class Exercise_20 {

	public Exercise_20() {
		Sequence sequence = new Sequence(0);
		Sequence.ReverseSequenseSelector ss = sequence.new ReverseSequenseSelector();

		ss.print();
		
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
		public void print() {
			System.out.println("Sequense.Outer()");
		}
		public void add(Object x) {
			if(next < items.length) {
				items[next++] = x;
			}
		}
		
		private class ReverseSequenseSelector implements Selector {

			private int i = items.length - 1;
			
			@Override
			public boolean end() {
				return i < 0;
			}
			public void print() {
				System.out.println("ReverseSequenseSelector.Outer()");
			}

			@Override
			public Object current() {
				return items[i];
			}

			@Override
			public void next() {
				if(i >= 0) {
					i--;
				}
			}
			Sequence getSequence() {
				return Sequence.this;
			}
		}
		

		
//		private class SequnceSelector implements Selector {
//
//			private int i = 0;
//			
//			public Sequence getSequence() {
//				return Sequence.this;
//			}
//			
//			@Override
//			public boolean end() {
//				return i == items.length;
//			}
//			@Override
//			public Object current() {
//				return items[i];
//			}
//			@Override
//			public void next() {
//				if(i < items.length) { 
//					i++;
//				}
//			}
//
//		}
//		public Selector selector() {
//			return new SequnceSelector();
//		}
		public Selector reverSelector() {
			return new ReverseSequenseSelector();
		}
	}
}

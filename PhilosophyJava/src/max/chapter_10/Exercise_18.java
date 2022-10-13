package max.chapter_10;

public class Exercise_18 {

	public Exercise_18() {
		new Interface.Inner();
		Interface inner = new Interface.Inner();
		inner.print();
	}
	
	private interface Interface {
		void print();
		
		static class Inner implements Interface {
			@Override
			public void print() {
				System.out.println("Inner.print");
			}

			public Inner() {
				System.out.println("Inner.constract");
			}
		}
	}
}

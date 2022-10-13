package max.chapter_10;

public class Exercise_5 {

	public Exercise_5() {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
	
	private class Outer {
		Outer() {
			System.out.println("Outer.class");
		}
		private class Inner {
			public Inner() {
				System.out.println("Inner.class");
			}
		}
	}
}

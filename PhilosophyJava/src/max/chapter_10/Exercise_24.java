package max.chapter_10;

public class Exercise_24 {
	
	public Exercise_24() {
		Outer outer = new Outer();
		Outer1 outer1 = new Outer1();
		Outer1.Inner1 inner1 = outer1.new Inner1(outer, 1);
	}

	
	private class Outer {
		public Outer() {
			System.out.println("Outer.constracy");
		}
		private class Inner {
			public Inner(int i) {
				System.out.println("Outer.Inner.constract");
			}
		}
	}
	private class Outer1 {
		public Outer1() {
			System.out.println("Outer1.constract");
		}
		private class Inner1 extends Outer.Inner {
			public Inner1(Outer outer, int i) {
				outer.super(i);
				System.out.println("Outer1.Inner1.constract");
			}
		}
	}
}

package max.chapter_10;

public class Exercise_1 {

	public Exercise_1() {
		Outer outer = new Outer();
		Outer.Inner innert = outer.getInner();
		Outer.Inner ouInner = outer.new Inner();
		System.out.println(innert.equals(ouInner));
		Outer.Inner oInner = innert;
		System.out.println(oInner.equals(innert));
	}
	
	private class Outer {
		Outer() {
			System.out.println("Outer.class");
		}
		Inner getInner() {
			return new Inner();
		}
		private class Inner {
			public Inner() {
				System.out.println("Inner.class");
			}
		}
	}
}

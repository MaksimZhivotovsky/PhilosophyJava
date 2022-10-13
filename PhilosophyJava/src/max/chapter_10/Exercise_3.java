package max.chapter_10;

public class Exercise_3 {

	public Exercise_3() {
		Outer outer = new Outer("Hello Java");
		Outer.Inner inner = outer.getInner();
		System.out.println(inner.toString());
	}
	
	private class Outer {
		
		private String str;
		
		Outer(String str) {
			this.str = str;
			System.out.println("Outer.class " + str);
		}
		Inner getInner() {
			return new Inner();
		}
		private class Inner {
			public Inner() {
				System.out.println("Inner.class");
			}
			public String toString() {
				return str;
			}
		}
	}
}

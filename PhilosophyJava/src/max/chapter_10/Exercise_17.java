package max.chapter_10;

public class Exercise_17 {

	public Exercise_17() {
		Outer.StaticClass.StaticClassInner oStaticClassInner = new Outer.StaticClass.StaticClassInner();
		Outer.StaticClass oClass = new Outer.StaticClass();
	}
	
	private class Outer {
		Outer() {
			System.out.println("Outer");
		}
		private static class StaticClass {
			StaticClass() {
				System.out.println("StaticClass.constract");
			}
			private static class StaticClassInner {
				StaticClassInner() {
					System.out.println("StaticClassInner");
				}
			}
 		}
	}
}

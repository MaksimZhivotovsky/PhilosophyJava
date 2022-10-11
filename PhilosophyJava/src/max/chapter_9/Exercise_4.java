package max.chapter_9;

public class Exercise_4 {
	public Exercise_4() {
		Exempl.methodStatic(new Exempl());
		System.out.println();
		AbstractClass abstractClass = new Exempl();
		abstractClass.print();
	}

	public abstract class AbstractClass {
		public AbstractClass() {
			System.out.println("AbstractClass");
		}
		abstract void print();
	}
	public class Exempl extends AbstractClass {
		public void print() {
			System.out.println("Exempl extendx AbstractClass");
		}
		public static void methodStatic(AbstractClass abstractClass) {
//			((Exempl)abstractClass).print();
			abstractClass.print();
		}
	}
}

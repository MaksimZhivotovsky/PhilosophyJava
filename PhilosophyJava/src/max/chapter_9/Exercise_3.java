package max.chapter_9;

public class Exercise_3 {

	public Exercise_3() {
		Exempl exempl = new Exempl();
		exempl.print();
		System.out.println();
		Base eBase = new Exempl();
		eBase.print();
	}
	
	public abstract class Base {
		public Base() {
			print();
		}
		public abstract void print();
	}
	
	public class Exempl extends Base {

		private int i = 3;
		@Override
		public void print() {
			System.out.println("Exempl.int = " + i);
		} 
	}
}

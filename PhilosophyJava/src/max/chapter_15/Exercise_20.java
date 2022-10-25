package max.chapter_15;

public class Exercise_20 {

	public Exercise_20() {
		Exempl exempl = new Exempl();
		Test test = new Test();
		test.test(exempl);
		System.out.println();
		exempl.exempl();
	}
	
	private class Test {
//		private T interfase;
//		public Test(T interfase) {
//			this.interfase = interfase;
//		}
		public<T extends Interfase> void test(T t) {
//			interfase.method();
//			interfase.print();
			t.print();
			t.method();
		}
	}
	
	private interface Interfase {
		void print();
		void method();
	}
	private class Exempl implements Interfase {
		@Override
		public void print() {
			System.out.println("Exempl.print");
		}
		@Override
		public void method() {
			System.out.println("Exempl.meyhod");
		}
		public void exempl() {
			System.out.println("Exempl.exempl");
		}
	}
}

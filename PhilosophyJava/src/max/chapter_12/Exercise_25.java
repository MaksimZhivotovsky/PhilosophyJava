package max.chapter_12;

public class Exercise_25 {
	
	public Exercise_25() {
		A c = new C();
		try {
			c.method();
			System.out.println("C.constract");
		} catch (A3 e) {
			e.printStackTrace();
		} catch (A2 e) {
			e.printStackTrace();
		} catch (A1 e) {
			e.printStackTrace();
		}
	}

	private class A1 extends Exception {}
	private class A2 extends A1 {}
	private class A3 extends A2 {}
	
	private class A {
		void method() throws A1 {}
	}
	private class B extends A {
		@Override
		void method() throws A2{}
	}
	private class C extends B {
		@Override
		void method() throws A3{}
	}
}

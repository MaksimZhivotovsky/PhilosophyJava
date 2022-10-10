package max.chapter_8;

public class Exercise_10 {
	
	public Exercise_10() {
		Basic deleg = new Derivative();
		deleg.oneMethod();
	}

	public class Basic {
		public void oneMethod() {
			System.out.println("Basic.oneMethod");
			twoMethod();
		}
		public void twoMethod() {
			System.out.println("Basic.twoMethod");
		}
	}
	public class Derivative extends Basic {
		@Override
		public void twoMethod() {
			System.out.println("Derivative.twoMethod");
		}
	}
}

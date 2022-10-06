package max.chapter_7;

public class Exercise_22 {

	public final class One {
		public One() {
			System.out.println("final One.constract");
		}
	}
	public class Two {// extends  One { нельзя наследоваться
		public Two() {
			System.out.println("Two.constract");
		}
	}
}

package max.chapter_10;

public class Exercise_16 {

	public Exercise_16() {
		One.Two two = new One.Two();
	}
	
	private class One {
		public One() {
			System.out.println("One.constract");
		}
		static class Two {
			public Two() {
				System.out.println("Two.constract");
			}
		}
	}
}

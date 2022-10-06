package max.chapter_7;

public class Exercise_21 {

	class One {
		public final void exempl() {
			System.out.println("Exercise_21.One.exempl()");
		}
	}
	class Two extends One {
//		@Override//		@Override   exempl() нельзя даже без @Override
		public final void exempl1() {
			System.out.println("Exercise_21.Two.exempl()");
		}
	}
}

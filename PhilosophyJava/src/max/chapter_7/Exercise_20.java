package max.chapter_7;

public class Exercise_20 {

	class One {
		public final void exempl() {
			System.out.println("One.exempl");
		}
	}
	class Two extends One {
//		@Override   exempl() нельзя даже без @Override
		public final void exempll() {
			System.out.println("Two.exempl");
		}
	}
}

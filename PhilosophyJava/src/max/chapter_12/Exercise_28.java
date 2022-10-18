package max.chapter_12;

public class Exercise_28 {

	public Exercise_28() {
		Exempl exempl = new Exempl("der");
		exempl.print();
		main();
	}

	private void main() {
//		try {
			throw new Exempl("Exercise_28.main");
//		} catch (Exempl e) {
//			e.printStackTrace();
//			System.err.println(e);
//		}

	}
	
	private class Exempl extends RuntimeException {
		private final String string;
		public Exempl(String string) {
			super(string);
			this.string = string;
		}
		void print() {
			System.out.println(string);
		}
	}
}

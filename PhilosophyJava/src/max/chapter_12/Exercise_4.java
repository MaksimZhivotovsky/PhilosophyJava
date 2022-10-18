package max.chapter_12;

public class Exercise_4 {
	
	public Exercise_4() {
		Exempl exempl = new Exempl("der");
		exempl.print();
		main();
	}

	private void main() {
		try {
			throw new Exempl("Exercise_4.main");
		} catch (Exempl e) {
//			e.printStackTrace();
			System.err.println(e);
		}

	}
	
	private class Exempl extends Exception {
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

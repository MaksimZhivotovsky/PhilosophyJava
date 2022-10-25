package max.chapter_15;

public class Exercise_25 {
	
	public Exercise_25() {
		Exempl exempl = new Exempl();
		one(exempl);
		two(exempl);
	}

	private <T extends One> void one(T t) { t.onePrint(); }
	private <T extends Two> void two(T t) { t.twoPrint(); }
	
	private interface One { void onePrint();	}
	private interface Two{ void twoPrint(); }
	
	private class Exempl implements One, Two {

		@Override
		public void twoPrint() {
			System.out.println("Exempl.twoPrint");
		}

		@Override
		public void onePrint() {
			System.out.println("Exempl.onePrint");
		}
	}
}

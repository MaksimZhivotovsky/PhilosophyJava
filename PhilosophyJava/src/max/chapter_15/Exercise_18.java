package max.chapter_15;

public class Exercise_18 {

	public Exercise_18() {
		BigFish bigFish = new BigFish();
		LitteleFish litteleFish = new LitteleFish();
		Ocean ocean = new Ocean();
		ocean.exempl(bigFish, litteleFish);
	}
	
	private interface Food {
		public void eat(Food food);
	}
	
	private class Ocean {
		void exempl(Food b, Food l) {
			b.eat(l);
		}
	}
	
	private class LitteleFish implements Food {
		@Override
		public void eat(Food food) {
			System.out.println("Somfing " + food.getClass().getSimpleName());
		}
		public LitteleFish() {
			System.out.println("LitteleFish");
		}
	}
	private class BigFish implements Food {
		public BigFish() {
			System.out.println("BigFish");
		}
		public void eat(Food food) {
			System.out.println("Big eat " + food.getClass().getSimpleName());
		}
	}
}

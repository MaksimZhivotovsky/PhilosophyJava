package max.chapter_8;

public class Exercise_18 {
	
	public Exercise_18() {
		Cycle cycle = new Cycle();
		Cycle uniCycle = new Unicycle();
		Cycle biCycle = new Bicycle();
		Cycle triCycle = new Tricycle();
		cycle.balance();
		uniCycle.balance();
		biCycle.balance();
		triCycle.balance();
	}
	
	public class Cycle {
		public void ride() {
			System.out.println("Cycle.ride");
		}
		public void ride1() {
			System.out.println("Cycle1.ride");
		}
		public void balance() {
			System.out.println("Cycle.balance");
		}
	}
	public class Bicycle extends Cycle {
		@Override
		public void ride() {
			System.out.println("Bicycle.ride");
		}
		public void balance() {
			System.out.println("Bicycle.balance");
		}
	}
	public class Unicycle extends Cycle {
		@Override
		public void ride() {
			System.out.println("Unicycle.ride");
		}
		public void balance() {
			System.out.println("Unicycle.balance");
		}
	}
	public class Tricycle extends Cycle {
		@Override
		public void ride() {
			System.out.println("Tricycle.ride");
		}
//		public void balance() {
//			System.out.println("Tricycle.balance");
//		}
	}

}

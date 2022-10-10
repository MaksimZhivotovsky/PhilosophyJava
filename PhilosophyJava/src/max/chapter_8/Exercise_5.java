package max.chapter_8;

public class Exercise_5 {

	public Exercise_5() {
		Cycle cycle = new Cycle();
		cycle.ride();
		Cycle unicycle = new Unicycle();
		unicycle.ride();
		Cycle bicycle = new Bicycle();
		bicycle.ride();
		Cycle tricycle = new Tricycle();
		tricycle.ride();
	}
	
	public class Cycle {
		public void ride() {
			System.out.println("Cycle.ride");
			System.out.println(wheels());
		}
		public void ride1() {
			System.out.println("Cycle1.ride");
		}
		public int wheels() {
			return 1;
		}
	}
	public class Bicycle extends Cycle {
//		@Override
//		public void ride() {
//			System.out.println("Bicycle.ride");
//			
//		}
		public int wheels() {
			return 2;
		}
	}
	public class Unicycle extends Cycle {
		@Override
		public void ride() {
			System.out.println("Unicycle.ride");
			System.out.println(wheels());
		}
		public int wheels() {
			return 11;
		}
	}
	public class Tricycle extends Cycle {
//		@Override
//		public void ride() {
//			System.out.println("Tricycle.ride");
//		}
		public int wheels() {
			return 3;
		}
	}
}

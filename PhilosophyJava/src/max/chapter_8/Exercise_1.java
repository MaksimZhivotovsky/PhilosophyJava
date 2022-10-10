package max.chapter_8;

public class Exercise_1 {
	

	public Exercise_1() {
		Cycle cycle = new Cycle();
		cycle.ride();
		cycle.ride1();
		Cycle unicycle = new Unicycle();
		unicycle.ride();
		unicycle.ride1();
		Cycle bicycle = new Bicycle();
		bicycle.ride();
		bicycle.ride1();
		Cycle tricycle = new Tricycle();
		tricycle.ride();
		tricycle.ride1();
	}
	
	public Exercise_1(Cycle c) {
		c.ride();
	}
	
	public static void exempl() {
		Exercise_1 cycle = new Exercise_1();
		Exercise_1.Cycle cyc = cycle.new Cycle();
		Exercise_1 exe = new Exercise_1(cyc);
		cyc = cycle.new Unicycle();
		exe = new Exercise_1(cyc);
		cyc = cycle.new Bicycle();
		exe = new Exercise_1(cyc);
		cyc = cycle.new Tricycle();
		exe = new Exercise_1(cyc);
	}
 
	public class Cycle {
		public void ride() {
			System.out.println("Cycle.ride");
		}
		public void ride1() {
			System.out.println("Cycle1.ride");
		}
	}
	public class Bicycle extends Cycle {
		@Override
		public void ride() {
			System.out.println("Bicycle.ride");
		}
	}
	public class Unicycle extends Cycle {
		@Override
		public void ride() {
			System.out.println("Unicycle.ride");
		}
	}
	public class Tricycle extends Cycle {
		@Override
		public void ride() {
			System.out.println("Tricycle.ride");
		}
	}

}

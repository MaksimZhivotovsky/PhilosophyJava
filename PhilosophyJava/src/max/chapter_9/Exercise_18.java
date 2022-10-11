package max.chapter_9;

public class Exercise_18 {

	public Exercise_18() {
		Factory factory = new Factory();
		UnicycleImpl unicycle = new UnicycleImpl();
		BicycleImpl bicycle = new BicycleImpl();
		TricycleImpl tricycle = new TricycleImpl();
		
		factory.service(unicycle);
		factory.service(bicycle);
		factory.service(tricycle);
	}
	
	private interface Cycle {
		void create();
		void delete();
	}
	
	private interface FactoryCycle {
		Cycle getCycle();
	}
	
	private class Factory {	
		public void service(FactoryCycle factoryCycle) {
			Cycle cycle = factoryCycle.getCycle();
			cycle.create();
			cycle.delete();
		}
	}
	
	private class UnicycleImpl implements FactoryCycle {

		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	}
	
	private class BicycleImpl implements FactoryCycle {

		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	}
	
	private class TricycleImpl implements FactoryCycle {

		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
		
	}
 	
	private class Unicycle implements Cycle {

		@Override
		public void create() {
			System.out.println("Unicycle.create");
		}

		@Override
		public void delete() {
			System.out.println("Unicycle.delete");
		}
		
	}
	private class Bicycle implements Cycle {

		@Override
		public void create() {
			System.out.println("Bicycle.create");
			
		}

		@Override
		public void delete() {
			System.out.println("Bicycle.delete");

		}
	}
	private class Tricycle implements Cycle {

		@Override
		public void create() {
			System.out.println("Tricycle.create");
			
		}

		@Override
		public void delete() {
			System.out.println("Tricycle.delete");

		}
		
	}
}

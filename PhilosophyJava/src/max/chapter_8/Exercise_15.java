package max.chapter_8;

public class Exercise_15 {

	public Exercise_15() {
		Rodent[] rodents = {
				new Rodent(), new Beaver(), 
				new Mouse(), new Hamster()
//				new Rodent(),new Rodent(),
//				new Rodent(),new Rodent()
		};
		for(Rodent r : rodents) {
			r.check();
//			System.out.println(r.toString());
		}
	}
	
	public class Rodent {
		
		private static long count;
		private final long id = count++;
		
		public Rodent() {

		}
		
		public void check() {
			System.out.println(this.getClass().getSimpleName() + " " + id);
		}
		
		public void nibbles() {
			System.out.println("Rodent.nibbles");
		}
		public void running() {
			System.out.println("Rodent.running");
		}
		@Override
		public String toString() {
			return this.getClass().getSimpleName() + id;
		}
	}
	public class Beaver extends Rodent {
		@Override
		public void nibbles() {
			System.out.println("Beaver.nibbles");
		}
		@Override
		public void running() {
			System.out.println("Beaver.running");
		}
		@Override
		public String toString() {
			return this.getClass().getSimpleName();
		}
	}
	public class Mouse extends Rodent {
		@Override
		public void nibbles() {
			System.out.println("Mouse.nibbles");
		}
		@Override
		public void running() {
			System.out.println("Mouse.running");
		}
		@Override
		public String toString() {
			return this.getClass().getSimpleName();
		}
	}
	public class Hamster extends Rodent {
		@Override
		public void nibbles() {
			System.out.println("Hamster.nibbles");
		}
		@Override
		public void running() {
			System.out.println("Hamster.running");
		}
		@Override
		public String toString() {
			return this.getClass().getSimpleName();
		}
	}
}

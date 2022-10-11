package max.chapter_9;

public class Exercise_1 {


	public Exercise_1() {

		Rodent[] rodents = {
				new Mouse(),// new Rodent(),  
				new Hamster(), new Beaver()
		};
		for(Rodent r : rodents) {
//			System.out.println(r.toString());
//			r.running();
			r.nibbles();
		}
	}
	
	public abstract class Rodent {
		public abstract void nibbles();
		public void running() {
			System.out.println("Rodent.running");
		}
		@Override
		public String toString() {
			return this.getClass().getSimpleName();
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

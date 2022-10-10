package max.chapter_8;

public class Exercise_9 {

	public Exercise_9() {

		Rodent[] rodents = {
				new Rodent(), new Mouse(), 
				new Hamster(), new Beaver()
		};
		for(Rodent r : rodents) {
			System.out.println(r.toString());
			r.running();
			r.nibbles();
		}
	}
	
	public class Rodent {
		public void nibbles() {
			System.out.println("Rodent.nibbles");
		}
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

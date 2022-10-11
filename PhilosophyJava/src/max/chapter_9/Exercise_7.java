package max.chapter_9;

public class Exercise_7 {

	public Exercise_7() {
		Rodent[] rodents = {
				new Mouse(), 
				new Hamster(), new Beaver()
		};
		for(Rodent r : rodents) {
			System.out.println(r.toString());
			r.running();
			r.nibbles();
		}
	}
	
	public interface Rodent {
		public void nibbles();
		public void running();

	}
	public class Beaver implements Rodent {
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
	public class Mouse implements Rodent {
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
	public class Hamster implements Rodent {
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

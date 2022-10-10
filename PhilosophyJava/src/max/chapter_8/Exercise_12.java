package max.chapter_8;

public class Exercise_12 {

	public Exercise_12() {
		Rodent beaver = new Beaver();
		System.out.println();
		System.out.println();
		Beaver beaver2 = new Beaver();
	}
	
	public class Rodent {
		public Rodent() {
			System.out.println("Rodent.constract");
		}
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
		public Beaver() {
			System.out.println("Beaver.constract");
		}
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

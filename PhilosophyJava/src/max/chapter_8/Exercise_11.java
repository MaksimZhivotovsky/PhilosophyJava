package max.chapter_8;

public class Exercise_11 {
	
	public Exercise_11() {
		new Sandwich();
	}

	public class Pickle {
		public Pickle() {
			System.out.println("Pickle()");
		}
	}
	public class Meat {
		public Meat() {
			System.out.println("Meat()");
		}
	}
	public class Bread {
		public Bread() {
			System.out.println("Bread()");
		}
	}
	public class Chese {
		public Chese() {
			System.out.println("Chese()");
		}
	}
	public class Lettuce {
		public Lettuce() {
			System.out.println("Lettuce()");
		}
	}
	public class Lunch extends Meat {
		public Lunch() {
			System.out.println("Lunch()");
		}
	}
	public class PortableLunch extends Lunch {
		public PortableLunch() {
			System.out.println("PortableLunch()");
		}
	}
	public class Sandwich extends PortableLunch {
		private Bread bread = new Bread();
		private Chese chese = new Chese();
		private Pickle pickle = new Pickle();
		private Lettuce lettuce = new Lettuce();
		
		public Sandwich() {
			System.out.println("Sandwich()");
		}
	}
}

package max.chapter_9;

public class Exercise_8 {

	public Exercise_8() {
		Sandwich sandwich = new Sandwich();
		sandwich.make();
	}
	
	public interface FastFood {
		void add();
		void make();
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
	public class Sandwich extends PortableLunch implements FastFood {
		@Override
		public void add() {
			Bread bread = new Bread();
			Chese chese = new Chese();
			Pickle pickle = new Pickle();
			Lettuce lettuce = new Lettuce();
			
		}

		@Override
		public void make() {
			add();
		}


		
		public Sandwich() {
			System.out.println("Sandwich()");
		}
	}
}

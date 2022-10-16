package max.chapter_11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise_10 {

	
	public Exercise_10() {

		List<Rodent> rodents = Arrays.asList(new Rodent(),
				new Mouse(), new Hamster(), new Beaver());
		
		Iterator<Rodent> iterator = rodents.iterator();
		
		while (iterator.hasNext()) {
			Rodent rodent = iterator.next();
			System.out.println(rodent);
			rodent.running();
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

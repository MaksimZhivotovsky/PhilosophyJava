package max.chapter_15;

import java.util.ArrayList;
import java.util.List;

public class Exercise_2 {

	public Exercise_2() {
		Holder<Pet> pets = new Holder<>();
		pets.add(new Pet());
		pets.add(new Cat());
		pets.add(new Dog());
//		pets.add(new Dog());
//		pets.add(new Dog());
//		pets.add(new Dog());
		pets.get();
	}
	
	private class Holder<T> {

		private List<T> lists = new ArrayList<>();
		public Holder() {
//			if(lists.size() < 3 ) {
//				lists.add(t);
//			} else {
//				throw new ArrayIndexOutOfBoundsException();
//			}
		}
		public void add(T t) {
			if(lists.size() < 3 ) {
				lists.add(t);
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		public void get() {
			for(int i = 0; i < lists.size(); i++) {
				System.out.println(lists.get(i).getClass().getSimpleName());
			}
//			return lists;
		}
 	}
	private class Pet {
		public Pet() {
//			System.out.println("Pet.constract");
		}
	}
	private class Dog extends Pet {
		public Dog() {
//			System.out.println("Dog.constract");
		}
	}
	private class Cat extends Pet {
		public Cat() {
//			System.out.println("Cat.constract");
		}
	}
}

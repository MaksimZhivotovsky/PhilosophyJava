package max.chapter_15;

import java.util.ArrayList;
import java.util.List;

public class Exercise_28<T> {

	public Exercise_28() {
		Pet pet = new Pet();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Generic1<Pet> petGeneric1 = new Generic1<>();
		petGeneric1.set(cat);
		petGeneric1.set(dog);
		test(petGeneric1);
	}
	
	private <T extends Generic1> void test(T t) {
		t.set(t);
		System.out.println();
	}
	
	private class Generic1<T> {
		 List<T> list = new ArrayList<>();
		public void set(T t) {
			list.add(t);
			System.out.println(list);
		}
		public String toString() {
			return getClass().getSimpleName() ;
		}
	}
	private class Generic2<T> {
		 List<T> list = new ArrayList<>();
		public void get() {
			for(int i = 0; i < list.size(); i++)  {
				list.get(i);
			}
		}
//		public String toString() {
//			return getClass().getSimpleName();
//		}
	}
	private class Pet {
		public String toString() {
			return getClass().getSimpleName();
		}
	}
	private class Dog extends Pet {}
	private class Cat extends Pet {}
	
}

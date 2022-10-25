package max.chapter_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercise_6 {

	public Exercise_6() {
		RandomList<Integer> list = new RandomList<>();
		for(int i = 0; i < 20; i++) {
			list.add(i);
		}
		for(int i = 0; i < 20; i++) {
			System.out.print(list.select() + "  ");
		}
		
		
		RandomList<Pet> petList = new RandomList<>();
		petList.add(new Pet());
		petList.add(new Dog());
		petList.add(new Cat());
		for(int i = 0; i < 10; i++) {
			System.out.print(petList.select().getClass().getSimpleName() + "  ");
		}
	}
	
	 class RandomList<T> {
		private ArrayList<T> storage = new ArrayList<>();
		private Random rand = new Random(47);
		public void add(T item) { storage.add(item); }
		public T select() {
			return storage.get(rand.nextInt(storage.size()));
		}
	}
	 
		private class Pet {
			public Pet() {
				System.out.println("Pet.constract");
			}
		}
		private class Dog extends Pet {
			public Dog() {
				System.out.println("Dog.constract");
			}
		}
		private class Cat extends Pet {
			public Cat() {
				System.out.println("Cat.constract");
			}
		}
}

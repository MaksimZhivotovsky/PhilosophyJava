package max.chapter_15;

public class Exercise_1 {

	public Exercise_1() {
		Holder<Pet> pets = new Holder<>(new Pet());
		Pet pet = pets.get();
		Cat cat = new Cat();
		pets.set(cat);
		System.out.println("pets = " + pets.get().getClass().getSimpleName());
	}
	
	public class Holder<T> {
		private T a;
		public Holder(T а) { this.a = а; }
		public void set(T a) { this.a = a; }
		public T get() { return a; }
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

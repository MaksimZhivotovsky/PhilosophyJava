package max.chapter_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Exercise_12 {

	void f(Map<Pet, Cat> cMap) {
		System.out.println(cMap.getClass().getSimpleName());
	}
	
	public Exercise_12() {
		Pet pet =  new Pet();
		Cat cat = new Cat();
		
		Map<Pet, Cat> cMap = new HashMap<>();
		cMap.put(pet, cat);
		f(cMap);
	}
	
	private class New {
		public static <K,V> Map<K,V> map() {
		return new HashMap<K,V>();
		}
		public static <T> List<T> list() {
		return new ArrayList<T>();
		}
		public static <T> LinkedList<T> lList() {
		return new LinkedList<T>();
		}
		public static <T> Set<T> set() {
		return new HashSet<T>();
		}
		public static <T> Queue<T> queue() {
		return new LinkedList<T>();
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

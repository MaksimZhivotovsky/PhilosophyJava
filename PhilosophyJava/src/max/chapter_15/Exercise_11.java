package max.chapter_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Exercise_11 {

	public Exercise_11() {
		Map<String, Pet> petMap = New.map();
		List<Pet> pets = New.list();
		LinkedList<Pet> pList = New.lList();
		Set<Pet> pSet = New.set();
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

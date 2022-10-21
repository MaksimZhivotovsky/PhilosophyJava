package max.chapter_14;

public class Exercise_7 {

	public Exercise_7() {
		System.out.println("B методе main");
		new Candy();
		System.out.println("nocne создания объекта Candy");
		try {
			Class.forName("Gum");
		} catch(ClassNotFoundException e) {
			System.out.println("He удалось найти Gum");
		}
		System.out.println("nocne вызова метода Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("nocne создания объекта Cookie");

	}
	
	class Candy {
		static { System.out.println("3arpy3Ka класса Candy"); }
	}
	class Gum {
		static { System.out.println("3arpy3Ka класса Gum"); }
	}
	class Cookie {
		static { System.out.println("3arpy3Ka класса Cookie"); }
	}
}

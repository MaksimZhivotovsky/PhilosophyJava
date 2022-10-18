package max.chapter_12;

public class Exercise_21 {

	public Exercise_21() {
		try {
			Parent parent = new Parent();
			throw new Exepti();
		} catch (Exepti e1) {
			e1.printStackTrace();
		}
		try {
			Chaild chaild = new Chaild();
			throw new Exepti();
		} catch (Exepti e) {
			e.printStackTrace();
		}
	}
	
	private class Exepti extends Exception{}
	private class Parent {
		public Parent() throws Exepti {
			System.out.println("Parent.constract");
//			throw new Exepti();
		}
	}
	private class Chaild extends Parent {

		public Chaild() throws Exepti {
			super();
			System.out.println("Chaild.constract");
//			throw new Exepti();
		}
		
	}
}

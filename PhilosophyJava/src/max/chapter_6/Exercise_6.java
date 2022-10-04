package max.chapter_6;

public class Exercise_6 {
	
	private String str = "Hello PrivateClass";

	public Exercise_6() {
		DefaultClass defaultClass = new DefaultClass();
		defaultClass.exempl();
	}
	
	private class PrivateClass {
		private String string = "privateString";
		void print(String str) {
			System.out.println("PrivateClass.print: " + str);
		}
	}
	
	class DefaultClass {
		void exempl() {
			PrivateClass privateClass = new PrivateClass();
			privateClass.print(str);
			privateClass.print(privateClass.string);
		}
	}
}

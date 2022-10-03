package max.chapter_4;

public class WhileTest {
	public boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
	}
	public  void exempl() {
		while(condition())
			System.out.println("Inside while'");
		System.out.println("Exited while'");
	}
} 

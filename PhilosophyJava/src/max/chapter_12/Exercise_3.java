package max.chapter_12;

public class Exercise_3 {
	
	public Exercise_3() {
		exempl();
	}
	
	private void exempl() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
	}
}

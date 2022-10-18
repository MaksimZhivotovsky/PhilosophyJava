package max.chapter_12;

public class Exercise_1 {
	
	public Exercise_1() {
		main();
	}

	private void main() {
		try {
			throw new Exeptions("Message Exeptions"); 
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("EXCEPTION in Exercise_.main");
		} finally {
			System.out.println("Working");
		}
	}
	private class Exeptions extends Exception {
		public Exeptions(String message) {
			super(message);
		}
	}
}

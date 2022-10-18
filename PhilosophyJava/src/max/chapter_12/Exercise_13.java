package max.chapter_12;

import java.io.IOException;
import java.sql.SQLException;

public class Exercise_13 {

	public Exercise_13() {
		main();
	}
	
	private void main()  {
		try {
			first();
			throw new NullPointerException();
//			second();
//			there();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("FINALLY");
		}

	}
	private void first() throws First {
		throw new First();
	}
	private void second() throws Second {
		throw new Second();
	}
	private void there() {
		throw new There();
	}
	
	@SuppressWarnings("serial")
	private class First extends IOException {
		
	}
	@SuppressWarnings("serial")
	private class Second extends SQLException {
		
	}
	@SuppressWarnings("serial")
	private class There extends RuntimeException {
		
	}
}

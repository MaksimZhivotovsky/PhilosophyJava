package max.chapter_12;

import java.io.IOException;
import java.sql.SQLException;

public class Exercise_9 {

	public Exercise_9() {
		main();
	}
	
	private void main()  {
		try {
			first();
			second();
			there();
		} catch (Exception e) {
			e.printStackTrace();
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

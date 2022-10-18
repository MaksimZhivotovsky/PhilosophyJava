package max.chapter_12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise_7 {
	
	private Logger logger = Logger.getLogger("Exercise_7");

	public Exercise_7() {
		exempl();
	}
	
	private void exempl() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			logger.log(Level.INFO, "cs");
		}
	}
}

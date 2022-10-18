package max.chapter_12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise_8 {

	private Logger logger = Logger.getLogger("Exercise_8");
	
	public Exercise_8() {
		main();
	}
	
	private void main() {
		try {
			throw new Exempl("Hello Exeption");	
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
		}
		
	}
	
	private class Exempl extends Exception {
		private final String string;
		public Exempl(String string) {
			super(string);
			this.string = string;
		}
		void print() {
			System.out.println(string);
		}
	}
}

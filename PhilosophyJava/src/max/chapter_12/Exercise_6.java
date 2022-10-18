package max.chapter_12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise_6 {

	public Exercise_6() {
		first(); 
		second();
	}
	
	private void first()  {
		try {
			throw new FirstExeption();			
		} catch (FirstExeption e) {
//			System.out.println(e);
		}
//		throw new FirstExeption();
	}
	private void second() {
		try {
			throw new SecongExeption();
		} catch (Exception e) {
			// TODO: handle exception
		}
//		throw new SecongExeption();
	}
	
	private class FirstExeption extends Exception {
		private Logger logger = Logger.getLogger("FirstExeptoin");
		
		FirstExeption() {
			StringWriter stringWriter = new StringWriter();
			printStackTrace(new PrintWriter(stringWriter));
			logger.severe(stringWriter.toString());
		}
	}
	private class SecongExeption extends Exception {
		private static final Logger logger = Logger.getLogger("SecongExeption");
		
		SecongExeption() {
			StringWriter stringWriter = new StringWriter();
			printStackTrace(new PrintWriter(stringWriter));
			logger.log(Level.INFO, "XERNA");
		}
	}
}

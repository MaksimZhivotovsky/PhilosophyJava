package max.chapter_12;

import javax.imageio.IIOException;

public class Exercise_11 {
	
	public Exercise_11() {
			g();
	}

	private void f() throws IIOException {
		throw new IIOException("f");
	}
	private void g() {
		try {
			f();
		} catch (IIOException e) {
			e.printStackTrace();
			throw new ArithmeticException();     
//			try {
//				throw new SQLException();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
		}
	}
}

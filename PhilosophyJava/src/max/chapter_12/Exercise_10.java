package max.chapter_12;

import java.sql.SQLException;

import javax.imageio.IIOException;

public class Exercise_10 {
	
	public Exercise_10() {
		try {
			g();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void f() throws IIOException {
		throw new IIOException("f");
	}
	private void g() throws SQLException {
		try {
			f();
		} catch (IIOException e) {
			e.printStackTrace();
			throw new SQLException();
//			try {
//				throw new SQLException();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
		}
	}
}

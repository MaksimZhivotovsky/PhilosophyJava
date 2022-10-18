package max.chapter_12;

import java.sql.SQLException;

public class Exercise_17 {

	public Exercise_17() {
		for(int i = 0; i < 10; i++) {
			System.out.print("Now i: " + i + "   ");
			if(i == 3) {
				System.out.println("Now i = " + i);
			}
			if (i == 5) {
				try {
					throw new SQLException();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					System.out.println("finally block");
				}
			}
			if(i == 7) {
				System.out.println("Now i = " + i);
			}
			if(i == 9) {
				System.out.println("FINAl");
			}
		}
	}
}

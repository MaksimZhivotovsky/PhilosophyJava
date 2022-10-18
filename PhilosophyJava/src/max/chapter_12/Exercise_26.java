package max.chapter_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise_26 {

	public Exercise_26() {
		// Открываем файл:
		FileInputStream file = null;
		try {
			file = new FileInputStream("Exercise_25.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		// Используем файл ...
		// Закрываем файл:
		try {
			file.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		}
	}
}

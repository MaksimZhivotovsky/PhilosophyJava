package max.chapter_2;

public class Incrementable {

	class StaticTest {
		 static int i = 47;
	}
	
	public static int increment() {
		return StaticTest.i++;
	}
}

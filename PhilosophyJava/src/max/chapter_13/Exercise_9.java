package max.chapter_13;

public class Exercise_9 {

	public static String knights =
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " +
			"with... a herringf";

	public Exercise_9() {
		System.out.println(knights.replaceAll("a|q|i|o|u|y", "_"));
	}
}

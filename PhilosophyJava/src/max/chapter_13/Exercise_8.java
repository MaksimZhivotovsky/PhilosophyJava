package max.chapter_13;

import java.util.Arrays;

public class Exercise_8 {

	public static String knights =
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " +
			"with... a herringf";
	public Exercise_8() {
		String[] s = knights.split("the|you");
		System.out.println(Arrays.toString(s));
	}
}

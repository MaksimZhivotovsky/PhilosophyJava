package max.chapter_13;

public class Exercise_11 {
	
	private String s = "Arline ate eight apples and one orange while Anita hadn't any";

	public Exercise_11() {
		System.out.println(s.matches("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\b"));
	}
}

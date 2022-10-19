package max.chapter_13;

public class Exercise_10 {

	private String s = "Java now has regular expressions";
	
	public Exercise_10() {
		System.out.println(s.matches("^Java"));
		System.out.println(s.matches("\\Breg.*"));
		System.out.println(s.matches("n.w\\s+h(a|i)s"));
		System.out.println(s.matches("s?"));
		System.out.println(s.matches("s*"));
		System.out.println(s.matches("s+"));
		System.out.println(s.matches("s{4}"));
		System.out.println(s.matches("s{1}"));
		System.out.println(s.matches("s{0,3}"));
	}
}

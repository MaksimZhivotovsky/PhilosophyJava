package max.chapter_7;

public class Exercise_13 {

	public Exercise_13() {
		Exeml exeml = new Exeml();
		exeml.println(1);
		exeml.println(2l);
		exeml.println("Hello");
		exeml.println(11, "World");
	}
}
class Exempl {
	public void println(String str) {
		System.out.println(str);
	}
	public void println(int i) {
		System.out.println(i);
	}
	public void println(long l) {
		System.out.println(l);
	}
}
class Exeml extends Exempl {
	public void println(int i, String str) {
		System.out.println(i + " " + str);
	}
}

package max.chapter_7;

public class Cleanser {

	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void  apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	@Override
	public String toString() { return s; }
	public void exempl() {
		Cleanser cleanser = new Cleanser();
		cleanser.dilute();
		cleanser.apply();
		cleanser.scrub();
		System.out.println(cleanser);
	}
	
	public Cleanser() {
	}
}

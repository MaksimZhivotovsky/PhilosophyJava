package max.chapter_2;

public class DataOnly {

	private int i;
	private double d;
	private boolean b;
	
	public DataOnly(int i, double d, boolean b) {
		this.i = i;
		this.d = d;
		this.b = b;
	}
	
	public void print() {
		System.out.println(i + " " + d + " " + b);
	}
}

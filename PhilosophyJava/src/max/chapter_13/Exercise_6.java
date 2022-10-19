package max.chapter_13;

public class Exercise_6 {

	public Exercise_6() {
		Exempl exempl = new Exempl(1, 2, 3, 4);
		System.out.println(exempl.toString());
	}
	
	private class Exempl {
		private int i;
		private long l;
		private float f;
		private double d;
		Exempl(int i, long l, float f, double d) {
			this.i = i;
			this.l = l;
			this.f = f;
			this.d = d;
		}
		public String toString() {
			return String.format("%d %d %f %f", i, l, f, d);
		}
	}
}

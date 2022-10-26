package max.chapter_16;

import java.util.Arrays;

public class Exercise_6 {

	private BerylliumSphere[][] b;
	
	public Exercise_6() {
		test(2, 2);
	}
	
	private void test(int i, int j) {
		b = new BerylliumSphere[i][j];
		for(int n = 0; n < i; n++) {
			b[n] = new BerylliumSphere[i];
			for(int t = 0; t < b[n].length; t++) {
				b[n][t] = new BerylliumSphere();
			}
		}
		System.out.println(Arrays.deepToString(b));

	}
}

package max.chapter_16;

import java.util.Arrays;

public class Exercise_7 {

	private BerylliumSphere[][][] b;
	
	public Exercise_7() {
		test(2, 2, 2);
	}
	
	private void test(int i, int j, int q) {
		b = new BerylliumSphere[i][j][q];
		for(int n = 0; n < i; n++) {
			b[n] = new BerylliumSphere[i][];
			for(int t = 0; t < b[n].length; t++) {
				b[n][t] = new BerylliumSphere[t];
				for(int z = 0; z < b[n][t].length; z++) {
					b[n][t][z] = new BerylliumSphere();
				}
			}
		}
		System.out.println(Arrays.deepToString(b));

	}
}


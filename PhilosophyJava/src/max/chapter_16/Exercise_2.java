package max.chapter_16;

import java.util.Arrays;

public class Exercise_2 {

	private BerylliumSphere[] b;
	
	public Exercise_2() {
		exempl(5);
	}
	
	private void exempl(int i) {
		b = new BerylliumSphere[i];
		for(int j = 0; j < i; j++) {
			b[j] = new BerylliumSphere();
			System.out.println(b[j]);
		}
		System.out.println(Arrays.toString(b));
	}
}

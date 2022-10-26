package max.chapter_16;

import java.util.Arrays;
import java.util.Random;

public class Exercise_22 {

	Integer[] integers = {2, 5, 3, 4, 7, 8, 9,};
	
	public Exercise_22() {
		Random random = new Random();
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(10);;
		}
		System.out.println(Arrays.binarySearch(a, 2));
		System.out.println(Arrays.binarySearch(integers, 4));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(integers));
	}
}

package max.chapter_4;

import java.util.Random;

public class Exercise_16 {

	public Exercise_16() {
		Random random = new Random();
		int[] j = new int [25];

		for(int i = 0; i < 4; i++) {
			int h = random.nextInt(9);
			j[i] = h;
			if(j[i] < j[h]) {System.out.println(j[i] + " < " + j[h]);}
			if(j[i] > j[h]) {System.out.println(j[i] + " > " + j[h]);}
			if(j[i] == j[h]) {System.out.println(j[i] + " == " + j[h]);}
		}
	}
}

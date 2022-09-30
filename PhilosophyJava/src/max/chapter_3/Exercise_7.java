package max.chapter_3;

import java.util.Random;

public class Exercise_7 {
	
	private int i = 0, j = 1, r = 2;
	private Random random = new Random();
	private int q = random.nextInt(3);

	public Exercise_7() {
		System.out.println(q);
		if(q == i) System.out.println("HEAD");
		if(q == j) System.out.println("KRULA");
		if(q == r) System.out.println("REBRO");
	}
}

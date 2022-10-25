package max.chapter_15;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise_26 {

	public Exercise_26() {
		Number[] numbers = new Number[3]; //new Integer[5];
		numbers[0] = new AtomicInteger(2);
		numbers[1] = new Byte((byte) 0);
		numbers[2] = new Integer(3);
		
		for(Number i : numbers) {
			System.out.println(i.getClass().getSimpleName());
		}
	}
}

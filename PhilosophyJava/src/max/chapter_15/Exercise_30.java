package max.chapter_15;

public class Exercise_30 {

	public Exercise_30() {
		Holder<Integer> integer = new Holder<Integer>();
		Holder<Long> longer = new Holder<Long>();
		integer.set(2);
		longer.set(1l);
		System.out.println(integer.get() + " " + longer.get());
 	}
}

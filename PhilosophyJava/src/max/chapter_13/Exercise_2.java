package max.chapter_13;

import java.util.ArrayList;
import java.util.List;

public class Exercise_2 {

	public Exercise_2() {
		List<InfiniteRecqrsion> v = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			v.add(new InfiniteRecqrsion());
		}
		System.out.println(v);
	}
	private class InfiniteRecqrsion {
		public String toString() {
		return " InfiniteRecursion address: " + super.toString() + "\n";
		}
	}
}

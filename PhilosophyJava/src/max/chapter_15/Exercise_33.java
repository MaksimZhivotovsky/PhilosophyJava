package max.chapter_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_33 {

	public Exercise_33() {
		List<String> strings = new ArrayList<>();
		strings.addAll(Arrays.asList("A B C D a d v d E F G H I !".split(" ")));
		for(int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.print(s + " / ");
		}
	}
}
package max.chapter_13;

import java.util.Arrays;

public class Exercise_14 {

	String input =
			"This!!unusual use!!of exclamation!!points";
	
	public Exercise_14() {
		String s = "This!!unusual use!!of exclamation!!points".strip();
		String[] worlds = s.split("!!");
		for(String word : worlds) {
			System.out.print(word);
		}
		System.out.println();
		print(s.split(" "));
 	}
    private void print(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

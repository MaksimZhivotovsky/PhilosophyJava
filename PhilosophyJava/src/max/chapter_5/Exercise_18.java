package max.chapter_5;

public class Exercise_18 {
	
	public Exercise_18() {
		Exercise_18[] exercise_18s = new Exercise_18[2];
		exercise_18s[0] = new Exercise_18("one");
		exercise_18s[1] = new Exercise_18("two");
		for(int i = 0; i < exercise_18s.length; i++) {
			System.out.println(exercise_18s[i].getClass().getSimpleName());
		}
	}

	public Exercise_18(String string) {
		System.out.println(string);
	}

}

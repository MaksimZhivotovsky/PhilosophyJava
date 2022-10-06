package max.chapter_7;

public class Exercise_18 {
	
	private final ExemplFinal exemplFinal = new ExemplFinal();

	public Exercise_18() {
		Exercise_18 exercise_18 = new Exercise_18();
		exercise_18.exemplFinal.intFinal++;
		exercise_18.exemplFinal.intFinal = new Integer(3);
//		exercise_18.exemplFinal = new ExemplFinal();
	}
}
class ExemplFinal {
	static final int INT_STATIC_FINAL = 1;
	int intFinal = 1;
}

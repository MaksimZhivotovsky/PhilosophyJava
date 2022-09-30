package max.chapter_2;

public class Exercise_8 {

	static int i = 8;
	
	public void exempl() {
		Exercise_8 exercise_8_1 = new Exercise_8();
		Exercise_8 exercise_8_2 = new Exercise_8();
		Exercise_8 exercise_8_3 = new Exercise_8();
		
		exercise_8_1.i++;
		System.out.println(Exercise_8.i);
		exercise_8_2.i++;
		System.out.println(Exercise_8.i);
		exercise_8_3.i++;
		System.out.println(Exercise_8.i);
	}
}

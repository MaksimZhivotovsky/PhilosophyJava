package max.chapter_3;

public class Exercise_2 {

	private float f;
	
	public void exempl() {
		Exercise_2 exercise_1 = new Exercise_2();
		Exercise_2 exercise_2 = new Exercise_2();
		
		exercise_1.f = 2;
		exercise_2.f = 4;
		System.out.println("exercise_1.f = " + exercise_1.f 
				+ "  exercise_2.f = " + exercise_2.f);
		
		exercise_1 = exercise_2;
		System.out.println("exercise_1.f = " + exercise_1.f 
				+ "  exercise_2.f = " + exercise_2.f);
		
		exercise_1.f = 10;
		System.out.println("exercise_1.f = " + exercise_1.f 
				+ "  exercise_2.f = " + exercise_2.f);
		exercise_2.f = 20;
		System.out.println("exercise_1.f = " + exercise_1.f 
				+ "  exercise_2.f = " + exercise_2.f);
	}
}

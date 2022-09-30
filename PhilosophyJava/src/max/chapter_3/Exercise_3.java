package max.chapter_3;

public class Exercise_3 {

	private float f;
	
	class PaseObject{
		public void pase(Exercise_3 exercise_3) {
			exercise_3.f = 34f;
		}
	}
	
	public void exempl() {
		Exercise_3 exercise_3 = new Exercise_3();
		exercise_3.f = 24;
		System.out.println("exercise_3.f = " + exercise_3.f);
		PaseObject paseObject = new PaseObject();
		paseObject.pase(exercise_3);
		System.out.println("exercise_3.f = " + exercise_3.f);
	}
}

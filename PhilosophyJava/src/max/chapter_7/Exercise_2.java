package max.chapter_7;

public class Exercise_2 extends Detergent {

	@Override
	public void scrub() {
		append(" Exercise.scrub()");
		super.scrub();
	}
	public void sterilize() {
		append(" sterilize()");
	}
	public void exemplExercise_2() {
		Exercise_2 exercise_2 = new Exercise_2();
		exercise_2.dilute();
		exercise_2.apply();
		exercise_2.scrub();
		exercise_2.foarm();
		System.out.println(exercise_2);
		System.out.println("Проверяем базовый класс Detergent:");
		Detergent detergent = new Detergent();
		detergent.exemplDetergent();
	}
}

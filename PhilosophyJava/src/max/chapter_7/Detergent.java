package max.chapter_7;

public class Detergent extends Cleanser {

	@Override
	public void scrub() {
		append(" Detergent.scrub");
		super.scrub();
	}
	public void foarm() { append(" foam()"); }
	
	public void exemplDetergent() {
		Detergent detergent = new Detergent();
		detergent.dilute();
		detergent.apply();
		detergent.scrub();
		detergent.foarm();
		System.out.println(detergent);
		System.out.println("Проверяем базовый класс Cleanser:");
		Cleanser cleanser = new Cleanser();
		cleanser.exempl();
	}
}

package max.chapter_7;

public class Exercise_17 {

	public Exercise_17() {
		Amphibian1 amphibian1 = new Frog1();
		amphibian1.born();
		amphibian1.death();
	}
}
class Amphibian1 {
	public void born() {
		System.out.println("Amphibian1 born");
	}
	public void death() {
		System.out.println("Amphibian1 death");
	}
}
class Frog1 extends Amphibian1 {
	@Override
	public void born() {
		System.out.println("Frog1 born");
	}
	@Override
	public void death() {
		System.out.println("Frog1 death");
	}
}
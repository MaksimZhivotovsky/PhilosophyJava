package max.chapter_7;

public class Exercise_16 {

	public Exercise_16() {
		Amphibian frog = new Frog();
		frog.born();
		frog.death();
	}
}
class Amphibian {
	public void born() {
		System.out.println("Amphibian born");
	}
	public void death() {
		System.out.println("Amphibian death");
	}
}
class Frog extends Amphibian {
	
}
package max.chapter_15;

public class Pet {

	private static long count = 0;
	private final long id = count++;
	
	public Pet() {
		System.out.println("Pet.constract " + id);
	}
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}

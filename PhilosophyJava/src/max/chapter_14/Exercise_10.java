package max.chapter_14;

public class Exercise_10 {

	private Character[] c = {'a', 'b', 'c'};
	
	public Exercise_10() {
		System.out.println(c.getClass().getComponentType());
		System.out.println(c.getClass().getComponentType().isPrimitive());
	}
}

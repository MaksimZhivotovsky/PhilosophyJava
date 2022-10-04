package max.chapter_5;

public class Exercise_20 {
	
	public Exercise_20() {
		main(new String("new Sting "), new Integer(2));
		main(new Long(45), new String("Hello"), new Integer(89));
	}

	private void main(Object...args) {
		for(Object o : args) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}

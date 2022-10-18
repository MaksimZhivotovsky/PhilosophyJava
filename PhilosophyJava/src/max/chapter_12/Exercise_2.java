package max.chapter_12;

public class Exercise_2 {

	private Object o = null;
	
	public Exercise_2() {
		try {
			o.getClass();
		} catch (Exception e) {
			e.printStackTrace();
			o = new Object();
			System.out.println(o.getClass().getSimpleName());
		}
		
	}
}

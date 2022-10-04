package max.chapter_5;

public class Exercise_11 {
	
	private boolean chec = false;
 	
	public Exercise_11(boolean chec) {
		this.chec = chec;
		if(chec) {
			finalize();
		} else {
			System.out.println("Exercise_11.false");
		}
	}
	
	@Override
	public void finalize() {
		System.out.println("Exercise_11.finalize");
	}

}

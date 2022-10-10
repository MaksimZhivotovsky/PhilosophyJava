package max.chapter_5;

public class Tank {
	
	private boolean check = false;
	
	public Tank() {
		full();
		finalize();
		empty();
		finalize();
	}

	public void full() {
		check = true;
	}
	
	public void empty() {
		check = false;
	}
	
	@Override
	public void finalize() {
		if(check) {
			System.out.println("нужно опустошить!!!!");
		} else {
			System.out.println("Tank.finalize");
		}
	}
}

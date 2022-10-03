package max.chapter_4;

public class Exercise_21 {

	public Exercise_21() {
		for(int i = 0; i < 100; i++) {
			if(i == 99) { 
				break; //или return;
				} 
			System.out.println(i);
		}
	}
}

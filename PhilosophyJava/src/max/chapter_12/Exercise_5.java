package max.chapter_12;

public class Exercise_5 {

	private boolean check = true;
	private int i = 0;
	
	public Exercise_5() {
		while(check) {
			  try {
				  i++;
				  throw new ArithmeticException("Exercise_5");

			  }catch(Exception e) {
				  e.printStackTrace();
				  if(i > 3) {
					  check = false;
					  System.out.println("It's OK");
				  }
				  
			  }
			}
	}
}

package max.chapter_4;

public class Exercise_18 {

	public Exercise_18() {
		
		  boolean flag = true;
		  
	        for (int i = 2; i <= 100; i++) {
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    flag = false;
	                    break;
	                }
	            }
	            if (flag) {
	            	System.out.print(i + " ");
	            }
	            flag=true;
	        }
	}
}

package max.chapter_4;

public class Exercise_20 {
	
	public Exercise_20(int begin, int end, int testval, int target) {
		if(begin <= testval && testval <= end) {
			if(testval > target) {
				System.out.println("testval > target");
			} else if(testval < target) {
				System.out.println("testval < target");
			} else {
				System.out.println("testval == target");
			}
			
		} else if( testval < begin || testval > end) {
			System.out.println("testval < begin || testval > end");
		}
	}

}

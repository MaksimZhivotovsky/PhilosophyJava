package max.chapter_15;

import java.util.ArrayList;
import java.util.List;

public class Exercise_35 {
	
	public Exercise_35() {
		List<Moka> list = new ArrayList<>();
	    CheckedList checkedList = new CheckedList();
	    checkedList.test(list);
	    
	    for(Moka m : list) {
	    	System.out.println(m.getClass().getSimpleName());
	    }
	    
//	    Exception in thread "main" java.lang.ClassCastException: class max.chapter_15.Exercise_35$Espreso cannot be cast to class max.chapter_15.Exercise_35$Moka (max.chapter_15.Exercise_35$Espreso and max.chapter_15.Exercise_35$Moka are in unnamed module of loader 'app')
//		at max.chapter_15.Exercise_35.<init>(Exercise_35.java:13)
//		at max.Main.main(Main.java:8)

	    
	}

	private class CheckedList {
		void test(List moka) {
			moka.add(new Espreso());
		}
	}
	
	private class Coffe {}
	private class Espreso extends Coffe {}
	private class Moka extends Coffe {}
}

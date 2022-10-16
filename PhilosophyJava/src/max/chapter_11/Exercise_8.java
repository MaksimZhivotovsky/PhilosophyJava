package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise_8 {

	public Exercise_8() {
		List<Gerbil> gerbils = Arrays.asList(new Gerbil(1)
				, new Gerbil(2), new Gerbil(3), new Gerbil(4));
		Iterator<Gerbil> iterator = gerbils.iterator();
		while (iterator.hasNext()) {
			Gerbil gerbil = iterator.next();
//			System.out.print(gerbil.getClass().getSimpleName() + "  ");
//			System.out.println();
			System.out.print(gerbil.getGerbilNumber() + ":" + gerbil + ";  ");
		} 
	}
	
	private class Gerbil {
		private int gerbilNumber;
		Gerbil(int gerbilNumber) {
			this.gerbilNumber = gerbilNumber;
		}
		public int getGerbilNumber() {
			return gerbilNumber;
		}
		 
		public void hop() {
			System.out.print("Gerbil " + gerbilNumber + "  ");
		}
		
		public String toString() {
			return this.getClass().getSimpleName();
		}
	}
}

package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_1 {

	public Exercise_1() {
		List<Gerbil> gerbils = Arrays.asList(new Gerbil(1)
				, new Gerbil(2), new Gerbil(3), new Gerbil(4));
		
		for(Gerbil g : gerbils) {
			g.hop();
		}
		System.out.println();
		ArrayList<Gerbil> gerbils2 = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			gerbils2.add(new Gerbil(i+1));
		}
		for(int i = 0; i < gerbils2.size(); i++) {
			gerbils2.get(i).hop();
		}
	}
	
	private class Gerbil {
		private int gerbilNumber;
		Gerbil(int gerbilNumber) {
			this.gerbilNumber = gerbilNumber;
		}
		public void hop() {
			System.out.print("Gerbil " + gerbilNumber + "  ");
		}
	}
}

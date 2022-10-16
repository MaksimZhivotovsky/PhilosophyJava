package max.chapter_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercise_17 {

	public Exercise_17() {
        Map<String, Gerbil> map = new HashMap<>();
        map.put("First Gerbil", new Gerbil(1));
        map.put("Second Gerbil", new Gerbil(2));
        map.put("Third Gerbil", new Gerbil(3));
        map.put("Third Gerbil", new Gerbil(4));

        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Gerbil gerbil = map.get(key);
            System.out.print(key);
            gerbil.hop();
            }
        }
	private class Gerbil {
		private int gerbilNumber;
		Gerbil(int gerbilNumber) {
			this.gerbilNumber = gerbilNumber;
		}
		public void hop() {
			System.out.println("  "
					+ "Gerbil " + gerbilNumber + "  ");
		}
	}
}

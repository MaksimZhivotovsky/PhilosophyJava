package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise_6 {

	
	public Exercise_6() {
		new ListFeatures();
	}
	
	private class ListFeatures {
		private List<String> lists = new ArrayList<>();
		public ListFeatures() {
			Random random = new Random();
			for(Integer i = 0; i < 10; i++) {
				lists.add(i.toString());
			}
			System.out.println("1:  " + lists);
			String d = "4";
			lists.add(d);
			System.out.println("2:  " + lists);
			System.out.println("3:  " + lists.contains(d));
			lists.remove(d);
			String p = lists.get(2);
			System.out.println("4:  " + p + " " + lists.indexOf(p));
			String cymrix = "2";
			System.out.println("5:  " + lists.indexOf(cymrix));
			System.out.println("6:  " + lists.remove(cymrix));
			System.out.println("7: " + lists.remove(p));
			System.out.println("8:  " + lists);
			lists.add(3, new String("16"));
			System.out.println("9:  " + lists);
			List<String> sub = lists.subList(1, 4);
			System.out.println("Частичный список:  " + sub);
			System.out.println("10:  " + lists.contains(sub));
			Collections.sort(sub);
			System.out.println("После сортировки:  " + sub);
			System.out.println("11:  " + lists.containsAll(sub));
			Collections.shuffle(sub, random);
			System.out.println("После перемешивания:  " + sub);
			System.out.println("12:  " + lists.contains(sub));
			List<String> copy = new ArrayList<>(lists);
			sub = Arrays.asList(lists.get(1), lists.get(4));
			System.out.println("sub:  " + sub);
			copy.retainAll(sub);
			System.out.println("13:  " + copy);
			copy = new ArrayList<String>(lists);
			copy.remove(2);
			System.out.println("14:  " + copy);
			copy.removeAll(sub);
			System.out.println("15:  " + copy);
			copy.set(1, new String("56"));
			System.out.println("16:  " + copy);
			copy.addAll(2, sub);
			System.out.println("17:  " + copy);
			System.out.println("18:  " + lists.isEmpty());
			lists.clear();
			System.out.println("19:  " + lists);
			System.out.println("20: " + lists.isEmpty());
			
		}		
	}
}

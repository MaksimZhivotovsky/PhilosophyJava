package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise_5 {

	public Exercise_5() {
		new ListFeatures();
	}
	
	private class ListFeatures {
		private List<Integer> lists = new ArrayList<Integer>();
		public ListFeatures() {
			Random random = new Random();
			for(int i = 0; i < 10; i++) {
				lists.add(i);
			}
			System.out.println("1:  " + lists);
			Integer d = 4;
			lists.add(d);
			System.out.println("2:  " + lists);
			System.out.println("3:  " + lists.contains(d));
			lists.remove(d);
			Integer p = lists.get(2);
			System.out.println("4:  " + p + " " + lists.indexOf(p));
			Integer cymrix = 2;
			System.out.println("5:  " + lists.indexOf(cymrix));
			System.out.println("6:  " + lists.remove(cymrix));
			System.out.println("7: " + lists.remove(p));
			System.out.println("8:  " + lists);
			lists.add(3, new Integer(16));
			System.out.println("9:  " + lists);
			List<Integer> sub = lists.subList(1, 4);
			System.out.println("Частичный список:  " + sub);
			System.out.println("10:  " + lists.contains(sub));
			Collections.sort(sub);
			System.out.println("После сортировки:  " + sub);
			System.out.println("11:  " + lists.containsAll(sub));
			Collections.shuffle(sub, random);
			System.out.println("После перемешивания:  " + sub);
			System.out.println("12:  " + lists.contains(sub));
			List<Integer> copy = new ArrayList<Integer>(lists);
			sub = Arrays.asList(lists.get(1), lists.get(4));
			System.out.println("sub:  " + sub);
			copy.retainAll(sub);
			System.out.println("13:  " + copy);
			copy = new ArrayList<Integer>(lists);
			copy.remove(2);
			System.out.println("14:  " + copy);
			copy.removeAll(sub);
			System.out.println("15:  " + copy);
			copy.set(1, new Integer(56));
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

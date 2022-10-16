package max.chapter_11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise_14 {

	public Exercise_14() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0; i < 10; i++) {
			list.add(i);
		}
		
		int size = list.size()/2;
		
		LinkedList<Integer> revert = new LinkedList<Integer>();
		ListIterator<Integer> listIterator = list.listIterator(size);
		
		while (listIterator.hasPrevious()) {
			revert.add(listIterator.previous());
		}

		list.addAll(size, revert);
		System.out.println(list);
	}
}

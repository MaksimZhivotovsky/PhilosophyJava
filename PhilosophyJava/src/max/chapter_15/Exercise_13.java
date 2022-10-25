package max.chapter_15;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Exercise_13 {
	
	public Exercise_13() {
		List<String> list = new ArrayList<>();
		Set<String> set = new LinkedHashSet<>();
		Queue<String> queue = new PriorityQueue<>();
		List<String> list2 = new LinkedList<>();
		
		full(list2);
		full(list);
		full(set);
		full(queue);
	}

	private <T> List<T> full(List<T> listsList) {
		System.out.println(listsList.getClass().getSimpleName());
		return listsList;
	}
	private <T> Set<T> full(Set<T> set) {
		System.out.println(set.getClass().getSimpleName());
		return set;
	}
	private <T> Queue<T> full(Queue<T> queue) {
		System.out.println(queue.getClass().getSimpleName());
		return queue;
	}
}

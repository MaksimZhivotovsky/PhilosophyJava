package max.chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exercise_12 {

	public Exercise_12() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int size = list.size();

        List<Integer> reverseList = new ArrayList<>();

        ListIterator<Integer> listIterator = list.listIterator(size);
        while (listIterator.hasPrevious()) {
            reverseList.add(listIterator.previous());
        }

        for (Integer integer : reverseList) {
            System.out.print(integer + " ");
        }
        System.out.println();
        list.addAll(reverseList);
        System.out.println(list);

	}
}

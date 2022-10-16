package max.chapter_11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_19 {

	public Exercise_19() {
        Set<String> set = new HashSet<>();
        set.add("1mmp");
        set.add("722");
        set.add("121");
        

        System.out.println("HashSet: " + set);
        Set<String> keySet = set;
        Set<String> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(keySet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (String s : sortedSet) {
            linkedHashSet.add(s);
        }

        System.out.println("LinkedHashSet: " + linkedHashSet);

	}
}

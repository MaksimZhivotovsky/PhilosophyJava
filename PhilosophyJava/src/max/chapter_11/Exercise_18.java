package max.chapter_11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_18 {

	public Exercise_18() {
        Map<String, String> map = new HashMap<>();
        map.put("1mmp", "Ten");
        map.put("722", "Seven");
        map.put("121", "Twelve");
        

        System.out.println("HashMap: " + map);
        Set<String> keySet = map.keySet();
        Set<String> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(keySet);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        for (String s : sortedSet) {
            linkedHashMap.put(s, map.get(s));
        }

        System.out.println("LinkedHashMap: " + linkedHashMap);

	}
}

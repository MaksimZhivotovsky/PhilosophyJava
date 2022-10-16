package max.chapter_11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise_16 {
	
	private static final Set<Character> VOWELS = new HashSet<>(
            Arrays.asList('а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е',
                    'А', 'У', 'О', 'Ы', 'И', 'Э', 'Я', 'Ю', 'Ё', 'Е'));

	public Exercise_16() {
        System.out.println(vowelsInWord("Статистика по количеству гласных букв"));
        System.out.println(vowelsCountMap("Статистика по количеству гласных букв"));
	}
	
    static int vowelsInWord(final String word) {
        int counter = 0;
        for (int i = 0, n = word.length(); i < n; i++) {
            if (VOWELS.contains(word.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
    
    static Map<Character, Integer> vowelsCountMap(final String word) {
        Map<Character, Integer> resultMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (VOWELS.contains(c)) {
                resultMap.put(c, resultMap.containsKey(c) ? resultMap.get(c) + 1 : 1);
            }
        }

        return resultMap;
    }

}

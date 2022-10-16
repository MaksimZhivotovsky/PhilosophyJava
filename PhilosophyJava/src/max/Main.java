package max;

import java.util.Map;

import max.chapter_11.Exercise_19;

public class Main {

	public static void main(String[] args) {
		Exercise_19 exercise_1 = new Exercise_19();
		for(Map.Entry entry: System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " +
			entry.getValue());
		}
	}
}

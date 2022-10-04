package max.chapter_5;

public class Exercise_21 {

	private enum Money {
		UK, US, RU, EU, UA
	}
	
	public Exercise_21() {
		for(Money m : Money.values()) {
			System.out.println(m + ", ordinal " + m.ordinal());
		}
	}
}

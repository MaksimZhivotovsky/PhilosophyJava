package max.chapter_5;

public class Exercise_22 {

	public enum Money {
		UK, US, RU, EU, UA
	}
	
	public Exercise_22(Money money) {
		switch(money) {
		case UK: System.out.println("Деньги Британии"); break;
		case US: System.out.println("Деньги Америки"); break;
		case RU: System.out.println("Деньги России"); break;
		case EU: System.out.println("Деньги Европы"); break;
		case UA: System.out.println("Деньги Украины"); break;
		default: System.out.println("В списке таких денег нету"); break;
		}
	}
}

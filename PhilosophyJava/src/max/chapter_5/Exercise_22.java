package max.chapter_5;

public class Exercise_22 {

	public enum Money {
		UK, US, RU, EU, UA
	}
	
	public Exercise_22(Money money) {
		switch(money) {
		case UK: System.out.println("деньги Англии"); break;
		case US: System.out.println("деньги Америки"); break;
		case RU: System.out.println("деньги России"); break;
		case EU: System.out.println("деньги Европы"); break;
		case UA: System.out.println("деньги Украины"); break;
		default: System.out.println("таких денег нет в списке"); break;
		}
	}
}

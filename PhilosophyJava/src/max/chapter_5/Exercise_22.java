package max.chapter_5;

public class Exercise_22 {

	public enum Money {
		UK, US, RU, EU, UA
	}
	
	public Exercise_22(Money money) {
		switch(money) {
		case UK: System.out.println("������ ��������"); break;
		case US: System.out.println("������ �������"); break;
		case RU: System.out.println("������ ������"); break;
		case EU: System.out.println("������ ������"); break;
		case UA: System.out.println("������ �������"); break;
		default: System.out.println("� ������ ����� ����� ����"); break;
		}
	}
}

package max.chapter_7;

public class Exercise_8 {

	public Exercise_8() {
		new EXE();
		new EXE(22);
	}
}
class Base {
	public Base(String s) {
		System.out.println("Base.constract");
	}
}
class EXE extends Base {
	public EXE() {
		super("er");
		System.out.println("EXE.noArgs");
	}
	public EXE(int i) {
		super("we");
		System.out.println("EXE.args");
	}
}
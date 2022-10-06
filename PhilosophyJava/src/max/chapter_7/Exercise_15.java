package max.chapter_7;

public class Exercise_15 {

	public Exercise_15() {
		ProtectedMethod protectedMethod = new ProtectedMethod();
		protectedMethod.print();
		Extented extented = new Extented();
		extented.print();
	}
}
class ProtectedMethod {
	protected void print() {
		System.out.println("protectedMethod.print");
	}
}
class Extented extends ProtectedMethod {
	@Override
	public void print() {
		System.out.println("Extented extends ProtectedMethod.print");
	}
}

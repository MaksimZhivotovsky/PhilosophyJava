package max.chapter_7;

public class Exercise_7 {

	public Exercise_7() {
		C1 c = new C1();
	}
}
class A1 {
	public A1(int i) {
		System.out.println("A.constract");
	}
}
class B1 {
	public B1(int i) {
		System.out.println("B.constract");
	}
}
class C1 extends A1 {
	public B1 b;
	public C1() {
		super(11);
		
	}
}
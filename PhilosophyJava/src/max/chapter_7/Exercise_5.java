package max.chapter_7;

public class Exercise_5 {

	
	
	public Exercise_5() {
		C c = new C();
	}
}
class A {
	public A() {
		System.out.println("A.constract");
	}
}
class B {
	public B() {
		System.out.println("B.constract");
	}
}
class C extends A {
	public B b;
}
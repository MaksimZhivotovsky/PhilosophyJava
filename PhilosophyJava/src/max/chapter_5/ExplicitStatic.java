package max.chapter_5;

class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}
class Cups {
	static Cup cupl;
	static Cup cup2;
	static {
		cupl = new Cup(1);
		cup2 = new Cup(2);
	}
Cups() {
	System.out.println("Cups()");
		}
	}
public class ExplicitStatic {
	public ExplicitStatic() {	
		System.out.println("Inside main()");
		Cups.cupl.f(99); 
	}

}

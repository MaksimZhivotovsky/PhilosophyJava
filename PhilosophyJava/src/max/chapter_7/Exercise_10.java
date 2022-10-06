package max.chapter_7;

public class Exercise_10 {

	public Exercise_10 () {
		new Steam1(11);
	}
}
class Root1 {
//	Component11 component11 = new Component11(11);
//	Component21 component21 = new Component21(11);
//	Component31 component31 = new Component31(11);
	public Root1(int i) {
		System.out.println("Root.constract");
		Component11 component1 = new Component11(11);
		Component21 component2 = new Component21(11);
		Component31 component3 = new Component31(11);
	}
	private void print() {
		System.out.println("print");
	}
}
class Component11{
	public Component11(int i) {
		System.out.println("Component11.constract");
	}
}
class Component21 {
	public Component21(int i) {
		System.out.println("Component21.constract");
	}
}
class Component31 {
	public Component31(int i) {
		System.out.println("Component31.constract");
	}
}
class Steam1 extends Root1 {
	Component11 component1 = new Component11(11);
	Component21 component2 = new Component21(11);
	Component31 component3 = new Component31(11);
	
	public Steam1(int i) {
		super(i);
		System.out.println("Steam1.constract");
	}
//	@Override нельзя переопределить private метод
	public void print() {
		
	}
}

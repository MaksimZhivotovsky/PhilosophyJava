package max.chapter_7;

public class Exercise_9 {

	public Exercise_9() {
		new Steam();
	}
}
class Root {
//	Component1 component1 = new Component1();
//	Component2 component2 = new Component2();
//	Component3 component3 = new Component3();
	public Root() {
		System.out.println("Root.constract");
		Component1 component1 = new Component1();
		Component2 component2 = new Component2();
		Component3 component3 = new Component3();
	}
}
class Component1{
	public Component1() {
		System.out.println("Component1.constract");
	}
}
class Component2 {
	public Component2() {
		System.out.println("Component2.constract");
	}
}
class Component3 {
	public Component3() {
		System.out.println("Component3.constract");
	}
}
class Steam extends Root {
	Component1 component1 = new Component1();
	Component2 component2 = new Component2();
	Component3 component3 = new Component3();
	
	public Steam() {
		System.out.println("Steam.constract");
	}
}
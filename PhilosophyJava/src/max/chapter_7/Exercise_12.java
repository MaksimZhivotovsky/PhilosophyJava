package max.chapter_7;

public class Exercise_12 {

	public Exercise_12() {
		Steam2 steam2 = new Steam2();
		steam2.dispose();
	}
}
class Root2 {
//	Component1 component1 = new Component1();
//	Component2 component2 = new Component2();
//	Component3 component3 = new Component3();
	public Root2() {
		System.out.println("Root.constract");
		Component12 component1 = new Component12();
		component1.dispose();
		Component22 component2 = new Component22();
		component2.dispose();
		Component32 component3 = new Component32();
		component3.dispose();
	}
	public void dispose() {
		System.out.println("Root2.dispose");
	}
}
class Component12{
	public Component12() {
		System.out.println("Component12.constract");
	}
	public void dispose() {
		System.out.println("Component12.dispose");
	}
}
class Component22 {
	public Component22() {
		System.out.println("Component22.constract");
	}
	public void dispose() {
		System.out.println("Component22.dispose");
	}
}
class Component32 {
	public Component32() {
		System.out.println("Component32.constract");
	}
	public void dispose() {
		System.out.println("Component32.dispose");
	}
}
class Steam2 extends Root2 {
	Component12 component12 = new Component12();
	
	Component22 component22 = new Component22();
	Component32 component32 = new Component32();
	
	public Steam2() {
		System.out.println("Steam2.constract");
		component12.dispose();
		component22.dispose();
		component32.dispose();
	}
	public void dispose() {
		System.out.println("Steam2.dispose");
		super.dispose();
	}
}
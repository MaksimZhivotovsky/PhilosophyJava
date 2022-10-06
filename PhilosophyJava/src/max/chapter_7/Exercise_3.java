package max.chapter_7;

public class Exercise_3 {

	public Exercise_3() {
		new Carton();
	}
}
class Art{
	public Art() {
		System.out.println("Art.constract");
	}
}
class Drawing extends Art {
	public Drawing() {
		System.out.println("Drawing.constract");
	}
 }
class Carton extends Drawing {
	public Carton() {
		System.out.println("Carton.connstract");
	}
}
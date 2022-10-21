package max.chapter_14;

public class Exercise_4 {

	public Exercise_4() {
				
		Object object = new Object();
		Shape shape = new Shape();
		Rhomboid r = new Rhomboid();
		Shape rhomboid = new Rhomboid();
		if(rhomboid instanceof Shape) {
			System.out.println("rhomboid instanceof Shape");
			rhomboid =  new Shape();
			System.out.println("rhomboid = new Shape();");
			rhomboid.draw();
		}
	}
	public String ret(Shape s) {
		return s.toString();
	}
	
	class Rhomboid extends Shape {
		@Override
		public String toString() {
			return "Rhomboid";
		}
	}
	 class Shape {
		void draw() {
			System.out.println(this + ".draw()");
		}
		 public  String toString() {
			 return "Share";
		 }
	}
	class Circle extends Shape {
		public String toString() { return "Circle"; }
	}
	class Square extends Shape {
		public String toString() { return "Square"; }
	}
	class Triangle extends Shape {
		public String toString() { return "Triangle"; }
	}
}

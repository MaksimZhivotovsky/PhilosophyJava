package max.chapter_14;

public class Exercise_5 {
	
	public Exercise_5() {
		Shape shape = new Shape();
		Circle circle = new Circle();
		Rhomboid rhomboid = new Rhomboid();
		Square square = new Square();
		Triangle triangle = new Triangle();
		
		shape.rotate(triangle);
		shape.rotate(square);
		shape.rotate(circle);
		shape.rotate(triangle);
		
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
		void rotate(Shape shape) {
			if( shape instanceof Circle) {
				System.out.println("NO NEVER");
			} else {
				System.out.println("I'am doet!!!");
			}
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

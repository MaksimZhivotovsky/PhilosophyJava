package max.chapter_14;

public class Exercise_3 {

	public Exercise_3() {
//		List<Shape> shapeList = Arrays.asList(
//				new Circle(), new Square(),
//				new Triangle(), new Rhomboid()
//				);
//		for(Shape shape : shapeList)
//			shape.draw();
				
		Object object = new Object();
		Shape shape = (Shape) object;
		Shape rhomboid = new Rhomboid();
//		Shape shape = new Shape();
	//	Rhomboid rhomboid2 = (Rhomboid) new Shape();
		Shape rhomboid3 = shape;
//		Rhomboid rhomboid4 = (Rhomboid) new Circle();
		System.out.println(ret(rhomboid3));
				
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

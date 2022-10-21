package max.chapter_14;

import java.util.Arrays;
import java.util.List;

import max.chapter_14.Exercise_5.Circle;
import max.chapter_14.Exercise_5.Rhomboid;
import max.chapter_14.Exercise_5.Shape;
import max.chapter_14.Exercise_5.Square;
import max.chapter_14.Exercise_5.Triangle;

public class Exercise_6 {

	public Exercise_6() {
//		Shape shape = new Shape();
//		Circle circle = new Circle();
//		Rhomboid rhomboid = new Rhomboid();
//		Square square = new Square();
//		Triangle triangle = new Triangle();
//		
//		shape.rotate(rhomboid);
//		shape.rotate(square);
//		shape.rotate(circle);
//		shape.rotate(triangle);
//		System.out.println(circle.toString());
//		System.out.println(square.toString());
//		System.out.println(triangle.toString());
//		System.out.println(rhomboid.toString());
		
		List<Shape> shapes = Arrays.asList(
				new Shape(), new Circle(), new Rhomboid(), 
				new Square(), new Triangle()
				);
		for(Shape s : shapes) {
			try {
				s.rotate(s);
			} catch (Exception e) {
				System.out.print(s.getClass().getSimpleName() + " can't be rotated! ");
				System.out.println(s.flag());
			}
		}
		
	}
	
	class Rhomboid extends Shape {}
	 class Shape {
		 private boolean flag = false;
		 
		 public boolean flag() {
			 return flag = true;
		 }

			void rotate(Shape shape) throws Exception {
				if( shape instanceof Circle) {
					System.out.println("NO NEVER " + flag);
				} else {
					throw new Exception();
				}
			}
		 
		void draw() {
			System.out.println(this + ".draw()");
		}

		 public  String toString() {
			 return getClass().getSimpleName() + "  " + flag;
		 }
	}
	class Circle extends Shape {
	}
	class Square extends Shape {
	}
	class Triangle extends Shape {
	}
}

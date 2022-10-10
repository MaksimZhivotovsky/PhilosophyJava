package max.chapter_8;

public class Exercise_3 {

	public Exercise_3() {
		Share share = new Share();
		share.print();
		Share circle = new Circle();
		circle.print();
		Share square = new Square();
		square.print();
		Share triangle = new Triangle();
		triangle.print();
	}
	
	public class Share {
		public void draw() {
			System.out.println("Share.draw");
		}
		public void erase() {
			System.out.println("Share.erase");
		}
		public void print() {
			System.out.println("Share.print");
		}
	}
	public class Circle extends Share {
		@Override
		public void draw() {
			System.out.println("Circle.draw");
		}
		@Override
		public void erase() {
			System.out.println("Circle.erase");
		}
		@Override
		public void print() {
			System.out.println("Cyrcle.print");
		}
	}
	public class Square extends Share {
		@Override
		public void draw() {
			System.out.println("Square.draw");
		}
		@Override
		public void erase() {
			System.out.println("Square.erase");
		}
		@Override
		public void print() {
			System.out.println("Square.print");
		}
	}
	public class Triangle extends Share {
		@Override
		public void draw() {
			System.out.println("Triangle.draw");
		}
		@Override
		public void erase() {
			System.out.println("Triangle.erase");
		}
		@Override
		public void print() {
			System.out.println("Triangle.print");
		}
	}
}

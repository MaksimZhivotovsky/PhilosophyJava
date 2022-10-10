package max.chapter_8;

import max.chapter_8.Exercise_3.Share;

public class Exercise_4 {

	public Exercise_4() {
		Share rhomb = new Rhomb();
		rhomb.draw();
		rhomb.erase();
		rhomb.print();
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
	public class Rhomb extends Share {
		@Override
		public void draw() {
			System.out.println("Rhomb.draw");
		}
		@Override
		public void erase() {
			System.out.println("Rhomb.erase");
		}
		@Override
		public void print() {
			System.out.println("Rhomb.print");
		}
	}
}

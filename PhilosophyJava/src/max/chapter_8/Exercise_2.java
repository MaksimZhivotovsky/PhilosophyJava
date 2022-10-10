package max.chapter_8;

public class Exercise_2 {

	
	public class Share {
		public void draw() {
			System.out.println("Share.draw");
		}
		public void erase() {
			System.out.println("Share.erase");
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
	}
}

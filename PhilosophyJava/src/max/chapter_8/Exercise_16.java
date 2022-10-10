package max.chapter_8;

public class Exercise_16 {
	
	public Exercise_16() {
		new RectangularGlyph(5);
	}
	
	public class Glyph {
		void draw() { System.out.println("Glyph.draw()"); }
		Glyph() {
		System.out.println("Glyph() перед вызовом draw()");
		draw();
		System.out.println("Glyph() после вызова draw()");
		}
	}
	
	public class RoundGlyph extends Glyph {
		private int radius = 1;
		RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(); radius = " + radius);
			}
		void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
		}
	}
	public class RectangularGlyph extends Glyph {
		private int radius = 1;
		RectangularGlyph(int r) {
		radius = r;
		System.out.println("RectangularGlyph.RectangularGlyph(); radius = " + radius);
			}
		void draw() {
		System.out.println("RectangularGlyph.draw(), radius = " + radius);
		}
	}
}

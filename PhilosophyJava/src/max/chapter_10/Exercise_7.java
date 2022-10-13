package max.chapter_10;

public class Exercise_7 {

	public Exercise_7() {
		Outer outer = new Outer();
		Outer.Inner inner = outer.getInner();
		inner.outerIntChenge();
		System.out.println(inner.outerIntChenge());
	}
	
	private class Outer {
		private int i = 5;
		private String string() {
			return "Outer.privateString";
		}
		
		Inner getInner() {
			return new Inner();
		}
		private class Inner {
			String outerIntChenge() {
//				System.out.println(string());
				i = 10;
				return 	string()+ " i = " + i;
			}
			
		}
	}
}

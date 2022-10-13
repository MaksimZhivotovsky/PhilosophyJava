package max.chapter_10;

public class Exercise__7 {

	public Exercise__7() {
		Outer outer = new Outer();
		outer.getIntrePrint().print();
		IntrePrint intrePrint = outer.getIntrePrint();
		intrePrint.print();
	}
	
	private interface IntrePrint {
		void print();
	}
	
	private class Outer {
		IntrePrint getIntrePrint() {
			return new IntrePrint() {
				
				@Override
				public void print() {
					System.out.println("Outer.getInterPrint.return");
				}
			};
		}
	}
}

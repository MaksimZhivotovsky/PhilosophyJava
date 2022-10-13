package max.chapter_10;

public class Exercise__8 {

	public Exercise__8() {
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
			class InnerImpl implements IntrePrint {

				@Override
				public void print() {
					System.out.println("Outer.getInnerPrint.print");
				}
			}
			return new InnerImpl();
		}
	}
}

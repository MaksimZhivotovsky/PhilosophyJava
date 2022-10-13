package max.chapter_10;

public class Exercise_9 {

	public Exercise_9() {
		
		Inter inner = getInter();
		inner.print();
		Inter interInnet = new Inner();
		interInnet.print();
	}
	
	private Inter getInter() {
		return new Inner();
	}
	
	private interface Inter {
		void print();
	}
	private class Inner implements Inter {

		@Override
		public void print() {
			System.out.println("Inner impl Inter");
		}
	}
}

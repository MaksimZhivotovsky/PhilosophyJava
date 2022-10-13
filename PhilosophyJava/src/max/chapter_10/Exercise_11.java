package max.chapter_10;

public class Exercise_11 {
	
	public Exercise_11() {
		getInter().print();
		Inter inter = getInter();
		inter.print();
	}

	private Inter getInter() {
		return new Inter() {
			@Override
			public void print() {
				System.out.println("Hello getInter");
			}
		};
	}
	
	private interface Inter {
		void print();
	}
//	private class Inner implements Inter {
//
//		@Override
//		public void print() {
//			System.out.println("Inner impl Inter");
//		}
//	}
}

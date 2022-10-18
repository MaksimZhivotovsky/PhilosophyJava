package max.chapter_12;

public class Exercise_23 {

	public Exercise_23() {
		FailingConstructor failing = new FailingConstructor(0);

	}
	private class FailingConstructor {
		private Dispose dispose;
		private int i;
		
		public FailingConstructor(int i) {
			this.i = i;
			dispose = new Dispose();
			if(i == 0) {
				try {
					System.out.println("FailingConstructor args i = " + i);
					throw new NullPointerException();
				} catch (Exception e) {
					dispose.dispose();
					e.printStackTrace();
					dispose = new Dispose();
				}
			} else {
				System.out.println("FailingConstructor args i = " + i);

			}
		}
	}
	private class Dispose {
		private static int count = 0;
		private final int nomber = count ++;
		public Dispose() {
			System.out.println("Dispose " + nomber);
		}
		void dispose() {
			System.out.println("Dispose.dispose" + nomber);
		}
	}
}

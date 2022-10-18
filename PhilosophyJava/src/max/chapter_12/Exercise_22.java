package max.chapter_12;

public class Exercise_22 {

	public Exercise_22() {
		try {
			FailingConstructor failingConstructor = new FailingConstructor(0);
		} catch (Exception e) {
			new FailingConstructor(1);
		}
	}
	private class FailingConstructor {
		public FailingConstructor(int i) {
			if(i == 0) {
				throw new NullPointerException();
			} else {
				System.out.println("FailingConstructor args i = " + i);
			}
		}
	}
}

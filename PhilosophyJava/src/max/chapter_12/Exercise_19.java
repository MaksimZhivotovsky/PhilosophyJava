package max.chapter_12;

public class Exercise_19 {

	public Exercise_19() {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				lm.dispose();
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	class VeryImportantException extends Exception {
		public String toString() {
			return "Очень важное исключение!";
		}
	}
	 class HoHumException extends Exception {
		public String toString() {
			return "Второстепенное исключение";
		}
	}
	 class One extends Exception {
		 public String toString() {
			 return "ONE";
		 }
	 }
	class LostMessage {
		void f() throws VeryImportantException {
			throw new VeryImportantException();
		}
		void dispose() throws HoHumException {
				throw new HoHumException();
			}
		}
}

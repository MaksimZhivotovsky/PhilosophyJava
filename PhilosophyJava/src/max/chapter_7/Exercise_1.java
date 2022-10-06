package max.chapter_7;

public class Exercise_1 {

	private Exempl exempl;
	
	public Exercise_1() {

	}
	
	public void check() {
		if(exempl == null) {
			Exempl exempl = new Exempl();
			System.out.println(exempl);
		} else {
			System.out.println("Exempl faind " + exempl);
		}
	}

	public Exempl getExempl() {
		return exempl;
	}

	public void setExempl(Exempl exempl) {
		this.exempl = exempl;
	}
	
	 public static class Exempl {

			@Override
			public String toString() {
				return "Exempl []";
			}
			
		}
}

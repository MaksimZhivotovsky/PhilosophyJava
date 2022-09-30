package max.chapter_3;

import java.util.Objects;

public class Dog {

	private String name;
	private String say;
	
	public void exempl() {
		Dog spot = new Dog("Spot", "GAW-GAW");
		Dog scruffi = new Dog("Scruffi", "POW-POW");
		
		System.out.println("spot.name: " + spot.name + "  spot.say: " + spot.say);
		System.out.println("scruffi.name: " + scruffi.name + "  scruffi.say: " + scruffi.say);
	}
	
	public Dog(String name, String say) {
		super();
		this.name = name;
		this.say = say;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSay() {
		return say;
	}
	public void setSay(String say) {
		this.say = say;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, say);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(name, other.name) && Objects.equals(say, other.say);
	}
	
	
}

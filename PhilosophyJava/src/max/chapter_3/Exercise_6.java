package max.chapter_3;

import java.util.Objects;

public class Exercise_6 {
	
	public void exempl() {
		Dog spot = new Dog("Spot", "GAW-GAW");
		Dog scruffi = new Dog("Scruffi", "POW-POW");
		Dog dog;
		
		dog = spot;
		System.out.println(dog == spot);
		System.out.println(dog.equals(spot));
		System.out.println(dog == scruffi);
		System.out.println(dog.equals(scruffi));
	}
	
	public class Dog {

		private String name;
		private String say;
		
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
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(name, say);
			return result;
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
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(name, other.name) && Objects.equals(say, other.say);
		}
		private Exercise_6 getEnclosingInstance() {
			return Exercise_6.this;
		}
		
	}

}

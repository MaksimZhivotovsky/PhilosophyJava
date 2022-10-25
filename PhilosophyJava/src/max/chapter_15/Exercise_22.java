package max.chapter_15;

public class Exercise_22 {

	public Exercise_22() {
		Exempl<Dog> exempl = new Exempl<>(Dog.class);
//		exempl.create();
		System.out.println(exempl.create().getClass().getSimpleName());
	}
	
class Dog {}
	
	private class Exempl<T> {
	    final Class<T> kind;

	    public Exempl(Class<T> kind) {
	        this.kind = kind;
	    }

	    public T create() {
	        try {
	            return kind.getConstructor().newInstance(new Dog());
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
	}
}

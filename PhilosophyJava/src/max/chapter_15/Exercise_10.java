package max.chapter_15;

public class Exercise_10 {

	public Exercise_10() {
		Exempl exempl = new Exempl();
		exempl.f(3, "Hello", 1l);
	}
	
	private class Exempl {
		<T, C> void f(T t, C c, Long v) {
			System.out.println(t.getClass().getSimpleName());
			System.out.println(c.getClass().getSimpleName());
			System.out.println(v.getClass().getSimpleName());
		}
	}
}

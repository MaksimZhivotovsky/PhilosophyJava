package max.chapter_15;

public class Exercise_9 {

	public Exercise_9() {
		Exempl exempl = new Exempl();
		exempl.f(3, "Hello", 1l);
	}
	
	private class Exempl {
		<T, C, V> void f(T t, C c, V v) {
			System.out.println(t.getClass().getSimpleName());
			System.out.println(c.getClass().getSimpleName());
			System.out.println(v.getClass().getSimpleName());
		}
	}
}

package max.chapter_15;

public class Exercise_3 {
	public Exercise_3() {
		TupeTest.s();
		TupeTest.f();
	}
}
class TwoTuple<A,B> {
	public final A first;
	public final B second;
	public TwoTuple(A а, B b) { first = а; second = b; }
	public String toString() {
	return "(" + first + ", " + second + ")";
	}
}
class Dog {}

class TupeTest {
	static TwoTuple<String,Integer> f() {
		// Автоматическая упаковка преобразует int в Integer:
		return new TwoTuple<String, Integer>("hi", 47);
	}
	static SixTuple<String, Integer, Long, Dog, Float, Character> s() {
		return new SixTuple<String, Integer, Long, Dog, Float, Character>("Hello", 1, 2l, new Dog(), 4f, 'D');
	}
}
class  SixTuple<A, B, C, D, E, F> {
	public final A a; 
	public final B b;
	public final C c;
	public final D d;
	public final E e;
	public final F f;
	public  SixTuple(A a, B b, C c, D d, E e, F f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
	}
	@Override
	public String toString() {
		return "SixTuple [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + "]";
	}
	
}
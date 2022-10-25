package max.chapter_15;

public class Exercise_16 {

	public Exercise_16() {
		System.out.println(TupleTest21.q());
		System.out.println(TupleTest21.tuple("", 2));

}
}
class TupleTest21 {
	public static <A,B> TwoTuple111111<A,B> tuple(A a, B b) {
		return new TwoTuple111111<A,B>(a, b);
	}
	
	static SixTuple11<String, Integer, Long, Dog11, Float, Character> q() {
		return new SixTuple11<String, Integer, Long, Dog11, Float, Character>("Hello", 1, 2l, new Dog11(), 4f, 'D');
	}

}



class TwoTuple111111<A,B> {
	public final A first;
	public final B second;
	public TwoTuple111111(A а, B b) { first = а; second = b; }
	public String toString() {
	return "(" + first + ", " + second + ")";
	}
}
class Dog11 {}

class TupeTest11 {
	static TwoTuple111111<String,Integer> f() {
		// Автоматическая упаковка преобразует int в Integer:
		return new TwoTuple111111<String, Integer>("hi", 47);
	}
	static SixTuple11<String, Integer, Long, Dog11, Float, Character> s() {
		return new SixTuple11<String, Integer, Long, Dog11, Float, Character>("Hello", 1, 2l, new Dog11(), 4f, 'D');
	}
}
class  SixTuple11<A, B, C, D, E, F> {
	public final A a; 
	public final B b;
	public final C c;
	public final D d;
	public final E e;
	public final F f;
	public  SixTuple11(A a, B b, C c, D d, E e, F f) {
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


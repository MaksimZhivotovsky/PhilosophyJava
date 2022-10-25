package max.chapter_15;

public class Exercise_15 {

	public Exercise_15() {
		System.out.println(TupleTest2.q());
		System.out.println(TupleTest2.tuple("", 2));

}
}
class TupleTest2 {
	public static <A,B> TwoTuple11111<A,B> tuple(A a, B b) {
		return new TwoTuple11111<A,B>(a, b);
	}
	
	static SixTuple1<String, Integer, Long, Dog1, Float, Character> q() {
		return new SixTuple1<String, Integer, Long, Dog1, Float, Character>("Hello", 1, 2l, new Dog1(), 4f, 'D');
	}

}



class TwoTuple11111<A,B> {
	public final A first;
	public final B second;
	public TwoTuple11111(A а, B b) { first = а; second = b; }
	public String toString() {
	return "(" + first + ", " + second + ")";
	}
}
class Dog1 {}

class TupeTest1 {
	static TwoTuple11111<String,Integer> f() {
		// Автоматическая упаковка преобразует int в Integer:
		return new TwoTuple11111<String, Integer>("hi", 47);
	}
	static SixTuple1<String, Integer, Long, Dog1, Float, Character> s() {
		return new SixTuple1<String, Integer, Long, Dog1, Float, Character>("Hello", 1, 2l, new Dog1(), 4f, 'D');
	}
}
class  SixTuple1<A, B, C, D, E, F> {
	public final A a; 
	public final B b;
	public final C c;
	public final D d;
	public final E e;
	public final F f;
	public  SixTuple1(A a, B b, C c, D d, E e, F f) {
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


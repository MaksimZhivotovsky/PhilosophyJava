package max.chapter_10;

public class Exercise_13 {

	public Exercise_13() {
		Two two = new Two();
		One to = two.getOne("Java");
		One one = two.getOne("Hello");
		One one1 = two.getOne("Hello");
		One one2 = one1;
		System.out.println(two.getOne("Java").equals(one));
		System.out.println(to.equals(one));
		System.out.println(one1.equals(one));
		System.out.println(one2.equals(one1));
	}
	
	private class One {
		One(String str) {
			System.out.println("One " + str);
		}
		
	}
	private class Two {
		One getOne(String s) {
			return new One(s) {
			};
		}
		
	}
}

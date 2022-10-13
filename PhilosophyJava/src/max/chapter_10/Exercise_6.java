package max.chapter_10;

import max.chapter_10.interfase.Inteface;

public class Exercise_6 {

	public Exercise_6() {
		Exempl exempl = new Exempl();
		exempl.getInteface().print();
	}
	
	private class Exempl extends Outer{
		
		Inteface getInteface() {
			return getInner();
		}
	}
	
	private class Outer {
		 Outer() {
				System.out.println("Outer.const");
		}
		 
		 Inner getInner() {
			 return new Inner();
		 }
		 
		 private class Inner implements Inteface {

			@Override
			public void print() {
				System.out.println("Inner.Interface");
			}
			 
		 }
	}
}

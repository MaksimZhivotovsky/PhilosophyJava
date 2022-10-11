package max.chapter_9;

public class Exercise_14 {

	public Exercise_14() {
		
		Exe exe = new Exe();
		Somfing somfing = new Somfing();
		
		somfing.one(exe);
		somfing.two(exe);
		somfing.three(exe);
		somfing.exempl(exe);
		
		System.out.println();
		
		Txe txe = new Txe();
		somfing.one(txe);
		somfing.two(txe);
		somfing.three(txe);
		somfing.exempl(txe);
		
	}
	
	public class Exe extends Somfing  implements Exempl1{

		@Override
		public void methodThreeOne() {
			System.out.println("Exe.methodThreeOne");
		}

		@Override
		public void methodThreeTwo() {
			System.out.println("Exe.methodThreeTwo");
		}

		@Override
		public void methodOneOne() {
			System.out.println("Exe.methodOneOne");
		}

		@Override
		public void methodOneTwo() {
			System.out.println("Exe.methodOneTwo");			
		}

		@Override
		public void methodTwoOne() {
			System.out.println("Exe.methodThreeTwo");			
		}

		@Override
		public void methodTwoTwo() {
			System.out.println("Exe.methodTwoOne");			
		}

		@Override
		public void exempl() {
			System.out.println("Exe.exempl");			
		}
		
	}
	public class Txe extends Somfing  implements Exempl1{

		@Override
		public void methodThreeOne() {
			System.out.println("Txe.methodThreeOne");
		}

		@Override
		public void methodThreeTwo() {
			System.out.println("Txe.methodThreeTwo");
		}

		@Override
		public void methodOneOne() {
			System.out.println("Txe.methodOneOne");
		}

		@Override
		public void methodOneTwo() {
			System.out.println("Txe.methodOneTwo");			
		}

		@Override
		public void methodTwoOne() {
			System.out.println("Txe.methodThreeTwo");			
		}

		@Override
		public void methodTwoTwo() {
			System.out.println("Txe.methodTwoOne");			
		}

		@Override
		public void exempl() {
			System.out.println("Txe.exempl");			
		}
		
	}
	
	public interface One1 {
		void methodOneOne();
		void methodOneTwo();
	}
	public interface Two1 {
		void methodTwoOne();
		void methodTwoTwo();
	}
	public interface Three1 {
		void methodThreeOne();
		void methodThreeTwo();
	}
	public interface Exempl1 extends One1, Two1, Three1 {
		void exempl();
	}
	public class Somfing {
		public void one(One1 one) {
			one.methodOneOne();
		}
		public void two(Two1 two) {
			two.methodTwoOne();
		}
		public void three(Three1 three) {
			three.methodThreeOne();
		}
		public void exempl(Exempl1 exempl) {
			exempl.exempl();
		}
	}
}

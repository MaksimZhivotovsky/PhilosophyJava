package max.chapter_9;

public class Exercise_13 {

	public interface Base {
		void base();
	}
	public interface One extends Base {
		void one();
		@Override
		void base();
	}
	public interface Two extends Base {
		void two();
		@Override
		void base();
	}
	public interface Exempl extends One, Two {
		void exempl();
		@Override
		void base();
	}
	public class Exe implements Exempl {

		@Override
		public void two() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void one() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void base() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exempl() {
			// TODO Auto-generated method stub
			
		}
		
	}
}

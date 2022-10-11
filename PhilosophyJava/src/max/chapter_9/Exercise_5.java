package max.chapter_9;

import max.chapter_9.interfaced.Interfased;

public class Exercise_5 {

	public Exercise_5() {
		Exempl exempl = new Exempl();
		exempl.print();
		exempl.start();
		exempl.stop();	
	}
	
	public class Exempl implements Interfased {

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("Exempl.print");
		}

		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("Exempl.start");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("Exempl.stop");
		}
		
	}
}

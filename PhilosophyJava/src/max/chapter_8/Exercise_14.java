package max.chapter_8;

public class Exercise_14 {

	public Exercise_14() {
		new ReferenceCounting();
	}
	
	public class Shared {
		private int refcount = 0;
		private static long counter = 0;
		private final long id = counter++;
		
		public Shared() {
			System.out.println("Создаем " + this);
		}
		public void addRef() {
			refcount++;

		}
		protected void dispose() {
			if(--refcount == 0) {
				System.out.println("Disposing " + this);
			}
		}
		@Override
		public void finalize() {
			if(refcount == 0) {
				System.out.println("finalize Shared "+ refcount);
			} else {
				System.out.println("Share have - " + refcount + " ссылки");
			}
		}
		public String toString() {
			return "Shared " + id;
		}
	}
	public class Composing {
		private Shared shared;
		private static long counter = 0;
		private final long id = counter++;
		
		public Composing(Shared shared) {
			System.out.println("Создаем " + this);
			this.shared = shared;
			this.shared.addRef();
		}
		protected void dispose() {
			counter--;
			System.out.println("disposing " + this);
			shared.dispose();
			shared.finalize();

			finalize();
		}
		@Override
		public void finalize() {
			if(counter == 0) {
				System.out.println("Composing finalize " + counter );
			} else {
				System.out.println("Composing have - " + counter + " ссылок");
			}
		}
		public String toString() {
			return "Composing " + id;
		}

	}
	public class ReferenceCounting {
		public ReferenceCounting() {
			Shared shared = new Shared();
			Composing[] composings = {
					new Composing(shared), new Composing(shared),
					new Composing(shared), new Composing(shared),
					new Composing(shared), new Composing(shared)
			};
			for(Composing c : composings) {
				c.dispose();
				
			}
		}
	}
}

package max.chapter_10;

public class Exercise_19 {
	
	public Exercise_19() {
		InterImpl impl = new InterImpl();
		Interface.Inner.exempl(impl);
	}

	private interface Interface {
		void print();
		
		class Inner {
			static void exempl(Interface interface1) {
				interface1.print();
			}
		}
	}
	private class InterImpl implements Interface {

		@Override
		public void print() {
			System.out.println("InterImpl.print");
		}
	}
}

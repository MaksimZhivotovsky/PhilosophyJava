package max.chapter_12;

public class Exercise_15 {
	
	public Exercise_15() {
		Switch sw = new Switch();
		try {
			sw.on();
			// Код, способный возбуждать исключения...
			throw new RuntimeException();
//			OnOffSwitch.f();


		} finally {
			sw.off();
		}
	}

	private class Switch {
		private boolean state = false;
		public boolean read() { return state; }
		public void on() { 
			state = true; 
			System.out.println(this); 
		}
		public void off() { 
			state = false; 
			System.out.println(this);
		}
		public String toString() { return state ? "вкл" : "выкл"; }
	}
	//: exceptions/OnOffExceptionl.java
	private class OnOffExceptionl extends Exception {} //f:~
	//: exceptions/0n0ffException2.java
	private class OnOffException2 extends Exception {}
	
	private class OnOffSwitch {
		private  Switch sw = new Switch();
		public static void f() throws OnOffExceptionl, OnOffException2 {}
	}
}

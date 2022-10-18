package max.chapter_12;

public class Exercise_14 {

	public Exercise_14() {
		OnOffSwitch offSwitch = new OnOffSwitch();
		offSwitch.main();
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
		
		 void main() {
//			 try {
				 sw.on();
				 throw new RuntimeException();
		// Код, который может возбуждать исключения...
//				 f();
//				 sw.off();
//			 } catch(OnOffExceptionl e) {
//				 System.out.println("OnOffExceptionl");
//				 sw.off();
//			 } catch(OnOffException2 e) {
//				 System.out.println("OnOffException2");
//				 sw.off();
//			 } catch (Exception e) {
//				e.printStackTrace();
//		}
		 }
	}
}

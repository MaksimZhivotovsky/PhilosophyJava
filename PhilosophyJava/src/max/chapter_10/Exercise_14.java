package max.chapter_10;

import max.chapter_9.Exercise_11.Apply;
import max.chapter_9.Exercise_11.ExemplImpl;

public class Exercise_14 {

	public Exercise_14() {
		
		ExemplImpl exemplImpl = new ExemplImpl();
		Processor processor = exemplImpl.getProcessor();
		
        Apply.process(processor, "123456789");
        Apply.process(processor, "1q2w3e4r5t");
	}
	
	private class Apply {

	    public static void process(Processor p, Object s) {
	        System.out.println("Using Processor " + p.name());
	        System.out.println(p.process(s));
	    }
	}
	
	private interface Processor {
	    String name();
	    Object process(Object input);
	}
	private class Exempl {
	    public static String swap(String s) {
	        char[] chars = s.toCharArray();
	        for (int i = 0, n = chars.length; i < n - 1; i += 2) {
	            char temp = chars[i];
	            chars[i] = chars[i + 1];
	            chars[i + 1] = temp;
	        }

	        return new String(chars);
	    }
	}
	private class ExemplImpl { // implements Processor {
		
		Processor getProcessor() {
			return new Processor() {

				@Override
				public String name() {
					return getClass().getSimpleName();
				}

				@Override
				public Object process(Object input) {
					return Exempl.swap((String) input);
				}
				
			};
		}

//	    @Override
//	    public String name() {
//	        return getClass().getSimpleName();
//	    }
//
//	    @Override
//	    public String process(Object input) {
//	        return Exempl.swap((String) input);
//	    }
	}
}

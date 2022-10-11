package max.chapter_9;

public class Exercise_11 {
	
	public Exercise_11() {
        Apply.process(new ExemplImpl(), "123456789");
        Apply.process(new ExemplImpl(), "1q2w3e4r5t");
	}
	
	public class Apply {

	    public static void process(Processor p, Object s) {
	        System.out.println("Using Processor " + p.name());
	        System.out.println(p.process(s));
	    }
	}
	
	public interface Processor {
	    String name();
	    Object process(Object input);
	}
	public class Exempl {
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
	public class ExemplImpl implements Processor {

	    @Override
	    public String name() {
	        return getClass().getSimpleName();
	    }

	    @Override
	    public String process(Object input) {
	        return Exempl.swap((String) input);
	    }
	}
}

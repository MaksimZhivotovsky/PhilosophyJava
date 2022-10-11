package max.chapter_9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Exercise_16 {
	
	public Exercise_16() {
        Scanner scanner = new Scanner(new AdapterCharSequence(10, 1));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
	}
	
	public class AdapterCharSequence extends CharSequence implements Readable {

	    private int count;

	    public AdapterCharSequence(int count, int count1) {
	        super(count);
	        this.count = count1;
	    }

	    @Override
	    public int read(CharBuffer cb) throws IOException {
	        if (count-- == 0)
	            return -1;

	        char[] sequence = getSequence();
	        cb.put(sequence);
	        cb.append("\n");
	        return sequence.length;
	    }
	}

	class CharSequence {

	    private static final Random RANDOM = new Random();
	    private char[] chars;

	    public CharSequence(int count) {
	        if (count < 1) {
	            throw new IllegalArgumentException("Последовательность символов должна состоять минимум из одного символа");
	        }

	        chars = new char[count];
	    }

	    public char[] getSequence() {
	        for (int i = 0; i < chars.length; i++) {
	            chars[i] = (char) (RANDOM.nextInt(25) + 97);
	        }

	        return chars;
	    }
	}
}

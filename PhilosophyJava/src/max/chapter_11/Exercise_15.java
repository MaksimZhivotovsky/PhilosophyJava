package max.chapter_11;

import java.util.Stack;

public class Exercise_15 {
	
    static final String INPUT = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

	
	public Exercise_15() {
		System.out.println(evaluate(INPUT));
	}
	
	private String evaluate(final String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == ' ') {
                sb.append(c);
            } else if (c == '+') {
                stack.push(chars[++i]);
            } else if (c == '-') {
                sb.append(stack.pop());
            }
        }

        return sb.toString();
    }

}

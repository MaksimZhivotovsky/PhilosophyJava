package max.chapter_15;

public class Exercise_5 {

	public Exercise_5() {
		LinkedStack<String> lss = new LinkedStack<>();
		for(String s : "Phasers on stun!".split(" "))
			lss.push(s);
		String s;
		while((s = lss.pop()) != null)
			System.out.println(s);
	}
	
	private class LinkedStack<T> {
		private Node top = new Node();
		
	    public void push(T item) {
	        top = new Node(item, top);
	    }

	    public T pop() {
	        T result = top.item;
	        if (!top.end()) {
	            top = top.next;
	        }

	        return result;
	    }
		
	    private class Node {
	        T item;
	        Node next;

	        Node() {
	            item = null;
	            next = null;
	        }

	        Node(T item, Node next) {
	            this.item = item;
	            this.next = next;
	        }

	        boolean end() {
	            return item == null && next == null;
	        }
	    }
	}
		

}

package max.chapter_15;

public class Exercise_32 {
	private int size = 10;
	
	public Exercise_32() {
		FixedSizeStack<String> strings = new FixedSizeStack<>(size);
		for(String s : "A B C D E F G H I !".split(" "))
			strings.push(s);
		for(int i = 0; i < size; i++) {
			String s = strings.pop();
			System.out.print(s + " ");
		}
	}

	private class FixedSizeStack<T> {
		private int index = 0;
		private Object[] storage;
		public FixedSizeStack(int size) {
			storage = new Object[size];
		}
		public void push(T item) { storage[index++] = item; }
//			@SuppressWarnings("unchecked")
			public T pop() { return (T)storage[--index]; }
	}
	
}

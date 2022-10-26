package max.chapter_16;

public class Exercise_8 {

	private class ArrayOfGenericType<T> {
		T[] array ; // 0K
		@ SuppressWarnings("unchecked")
		public ArrayOfGenericType(int size) {
			array = (T[]) new Object[size];
		}
	}
}

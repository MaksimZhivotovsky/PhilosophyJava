package max.chapter_15;

public class Exercise_14 {

	public Exercise_14() {

		Generator<Pet> generator = new Generator<>(Pet.class);
		for(int i = 0; i < 5; i++) {
			generator.next();
		}
	}
	
	class Generator<T> {
		private Class<T> type;
		public Generator() {}
		public Generator(Class<T> type) {
			this.type = type;
		}
		@SuppressWarnings("deprecation")
		public T next() {
			try {
				return type.newInstance();
			} catch (Exception e) {
				throw new RuntimeException();
			}

		}
	}

}

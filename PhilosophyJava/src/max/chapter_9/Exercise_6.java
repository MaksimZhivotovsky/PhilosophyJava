package max.chapter_9;

import max.chapter_9.interfaced.Interfased;

public class Exercise_6 {

	public class Exe implements Interfased {

		@Override
		public void print() {
			// Multiple markers at this line
//			- implements max.chapter_9.interfaced.
//			 Interfased.stop
//			- Cannot reduce the visibility of the inherited 
		}

		@Override
		public void start() {
//			Несколько маркеров на этой линии
//			- реализует максимум.chapter_9.interfaced.
//			Сопряжен.стоп
//			- Не удается уменьшить видимость унаследованного
		}

		@Override
		public void stop() {
// Multiple markers at this line
//			- implements max.chapter_9.interfaced.
//			 Interfased.stop
//			- Cannot reduce the visibility of the inherited 
		}
		
	}
}

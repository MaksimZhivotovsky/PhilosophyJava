package max.chapter_14;

interface NewInterfase {}

public class Exercise_2 implements NewInterfase {

		public Exercise_2() {
			
			ToyTest t = new ToyTest();
			
			Class c = null;
			try {
			c = Class.forName("max.chapter_14.Exercise_1");
			} catch(ClassNotFoundException e) {
			System.out.println("He удается найти FancyToy");
			System.exit(1);
			}
			t.printInfo(c);
			for(Class face : c.getInterfaces())
			t.printInfo(face);
			Class up = c.getSuperclass();
			Object obj = null;
			try {
			// Необходим конструктор по умолчанию:
			obj = up.newInstance();
			} catch(InstantiationException e) {
			System.out.println("He удалось создать экземпляр");
			System.exit(1);
			} catch(IllegalAccessException e) {
			System.out.println("OTKa3aHO в доступе");
			System.exit(1);
			}
			t.printInfo(obj.getClass());

		}

		interface HasBatteries {}
		interface Waterproof {}
		interface Shoots {}
		class Toy {
			// Закомментируйте следующий конструктор по умолчанию,
			// чтобы увидеть ошибку NoSuchMethodError ив (*1*)
//			Toy() {}
			Toy(int i) {}
		}
		class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
			FancyToy() { super(1); }
		}
		public class ToyTest {
			void printInfo(Class cc) {
				System.out.println("HMfl класса: " + cc.getName() +
						" является интерфейсом? [" + cc.isInterface() + "]");
				System.out.println("npocToe имя: " + cc.getSimpleName());
				System.out.println("KaHOHH4ecKoe имя : " + cc.getCanonicalName());
			}
		}
	
}

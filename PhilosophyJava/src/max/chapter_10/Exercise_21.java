package max.chapter_10;

public class Exercise_21 {

	public Exercise_21() {
        A[] aArray = {
                new A(), new A(), new A(), new A()
        };

        B b = new B(aArray.length);
        for (A a : aArray) {
            b.add(a.getU());
        }

        for (int i = 0; i < aArray.length; i++) {
            if (i % 2 == 0) {
                b.resetItem(i);
            }
        }

        b.callInterfaceMethods();
	}
	
	private interface U {
		void one();
		void two();
		void tree();
	}
	private class A {
		U getU() {
			return new U() {

				@Override
				public void one() {
					System.out.println("A.getU.one");
				}

				@Override
				public void two() {
					System.out.println("A.getU.two");
				}

				@Override
				public void tree() {
					System.out.println("AgetU.tree");
				}
				
			};
		}
	}
	private class B {

	    private U[] uItems;
	    private int counter;

	    public B(int count) {
	        if (count < 1) {
	            throw new IllegalArgumentException("Размер массива должен быть положительным числом.");
	        }
	        uItems = new U[count];
	    }

	    public void add(U item) {
	        int i = counter;
	        if (counter++ >= uItems.length) {
	            throw new RuntimeException("Массив объектов переполнен");
	        }

	        uItems[i] = item;
	    }

	    public void resetItem(int i) {
	        if (i >= uItems.length || i < 0) {
	            throw new IllegalArgumentException("В массиве элементов нет элемента с соответствующим индексом " + i);
	        }

	        if (uItems[i] == null) {
	            throw new IllegalArgumentException("Элемент с порядковым номером " + i + " уже сброшен");
	        }

	        uItems[i] = null;
	    }

	    public void callInterfaceMethods() {
	        for (U uItem : uItems) {
	            if (uItem != null) {
	                uItem.one();
	                uItem.two();
	                uItem.tree();
	            }
	        }
	    }
	}
}

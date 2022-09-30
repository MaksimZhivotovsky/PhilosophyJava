package max.chapter_2;

/** Первая программа-пример книги.
* Выводит строку и текущее число.
* @author Брюс Эккель
* @author www.MindView.net
* @version 4.0
*/
public class Overloading {
	public void exempl() {
	for(int i = 0; i < 5; i++) {
		Tree t = new Tree(i);
		t.info();
		t.info("fleperpyxeHHwft метод");
	}
		// Перегруженный конструктор:
		new Tree();
	}	
		class Tree {
			int height;
			Tree() {
				System.out.println("CaxaeM росток");
				height = 0;
			}
			Tree(int initialHeight) {
				height = initialHeight;
				System.out.println("Co3flaHne нового дерева высотой " +
						height + " м.");
			}
			void info() {
				System.out.println("Aepeeo высотой " + height + " м.");
			}
			void info(String s) {
				System.out.println(s + ": Дерево высотой " + height + " м.");
			}
		}
}	
	





package max.chapter_2;

/** ������ ���������-������ �����.
* ������� ������ � ������� �����.
* @author ���� ������
* @author www.MindView.net
* @version 4.0
*/
public class Overloading {
	public void exempl() {
	for(int i = 0; i < 5; i++) {
		Tree t = new Tree(i);
		t.info();
		t.info("fleperpyxeHHwft �����");
	}
		// ������������� �����������:
		new Tree();
	}	
		class Tree {
			int height;
			Tree() {
				System.out.println("CaxaeM ������");
				height = 0;
			}
			Tree(int initialHeight) {
				height = initialHeight;
				System.out.println("Co3flaHne ������ ������ ������� " +
						height + " �.");
			}
			void info() {
				System.out.println("Aepeeo ������� " + height + " �.");
			}
			void info(String s) {
				System.out.println(s + ": ������ ������� " + height + " �.");
			}
		}
}	
	





package max.chapter_9;

public class Exercise_17 {

	public Exercise_17() {
		Exempl exempl = new Exempl();
		int i = exempl.VALUE;
		int j = Exempl.VALUE;
		System.out.println(i + " " + j);
		
//		Exempl.VALUE;
//		exempl.VALUE;
//		
//		Multiple markers at this line
//		- Syntax error, insert "VariableDeclarators" to complete 
//		 LocalVariableDeclaration
//		- The static field Exercise_17.Interface.VALUE should be accessed in a 
//		 static way
//		Несколько маркеров на этой линии
//		- Синтаксическая ошибка, вставьте "VariableDeclarators" для завершения
//		Объявление локальной переменной
//		- Упражнение в статическом Поле_17.Интерфейс.Доступ к значению должен осуществляться
//		статическим способом
	}
	
	public interface Interface {
		int VALUE = 5;
	}
	public class Exempl implements Interface {
		
	}
}

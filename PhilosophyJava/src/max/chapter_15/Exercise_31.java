package max.chapter_15;

public class Exercise_31 {

	
	private interface Payable {}
	class Employee implements Payable {}
	class Hourly extends Employee
	implements Payable {} 
}

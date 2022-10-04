package max.chapter_5;

public class Exercise_14 {

	private static final String str1 = "Exercise_14.string1";
	private static String str2;
	
	 static {
		str2 = "Exercise_14.string2";
	}
	 
	 public Exercise_14() {
		 Exercise_14.exempl();
//		 str1 = "cat";
		 str2 = "dog";
		 System.out.println(str1 + "  " + str2);
		 Exercise_14.exempl();
	 }
	 
	 public static void exempl() {
		 System.out.println(str1);
		 System.out.println(str2);
	 }
}

package max.chapter_3;

public class Exercise_14 {
	
	private String str1 = "fer";
	private String str2 = "fer";
	private String str3 = "ger";
	private String str4 = new String("ger");
	
	public Exercise_14() {
		System.out.println("'" + (str1) +"'" +" - str1" + "  " +"'" + (str2)+"'" + " - str2");
		System.out.println((str1 == str2) + (" : str1 == str2"));
		System.out.println((str1 != str2) + (" : str1 != str2"));
		System.out.println(str1.equals(str2) + " : str1.equals(str2)");
		System.out.println();
		System.out.println("'" + (str1) +"'" +" - str1" + "  " +"'" + (str3)+"'" + " - str3");
		System.out.println((str1 == str3) + (" : str1 == str3"));
		System.out.println((str1 != str3) + (" : str1 != str3"));
		System.out.println(str1.equals(str3) + " : str1.equals(str3)");
		System.out.println();
		System.out.println("'" + (str3) +"'" +" - str3" + "  " +"' new(" + (str4)+")'" + " - str4");
		System.out.println((str3 == str4) + (" : str3 == str4"));
		System.out.println((str3 != str4) + (" : str3 != str4"));
		System.out.println(str3.equals(str4) + " : str3.equals(str4)");
	}

}

package max.chapter_5;

public class Exercise_16 {

	private String [] strings1 = {"str1", "str2", "srt3"};
	private String [] strings2 = new String[3];
	
	public Exercise_16() {
		strings2[0] = "strings2.str1";
		strings2[1] = "strings2.str2";
		strings2[2] = "strings2.str3";
//		strings2[3] = "strings2.str3"; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
//		Index 3 out of bounds for length 3
		for(int i = 0; i < strings1.length; i++) {
			System.out.println(strings1[i].toString());
		}
		for(int i = 0; i < strings2.length; i++) {
			System.out.println(strings2[i].toString());
		}
	}
}

package max.chapter_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_12 {
	

	static public final String РОЕМ =
	"Twas brillig, and the slithy toves\n" +
	"Did gyre and gimble ln the wabe.\n" +
	"All mimsy were the borogoves,\n" +
	"And the mome raths outgrabe\n" +
	"Beware the Jabberwock, my son,\n" +
	"The jaws that bite, the claws that catch.\n" +
	"Beware the lubjub bird, and shun\n" +
	"The frumious Bandersnatch.";
	
	public Exercise_12() {


		Matcher m =
				Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
				.matcher(РОЕМ);
				while(m.find()) {
				for(int j = 0; j <= m.groupCount(); j++) {
				 System.out.print("[" + m.group(j) + "]");
				}
				System.out.println();
	

		}
	}
}

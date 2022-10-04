package max.chapter_5;

public class Exercise_19 {

	public Exercise_19() {
		String[] str = {"one.str", "two.str", "tree.str"};
		exemple("one", "two", "tree");
		exemple(str);
	}
	
	private void exemple(String ... args) {
		for(String s : args) {
			System.out.println(s);
		}
	}
}

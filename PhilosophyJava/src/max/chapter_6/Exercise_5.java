package max.chapter_6;

public class Exercise_5 {

	public String publicString = "publicString";
	protected String protectedString = "protectedString";
	String defaultString = "defaultString";
	private String privateString = "privateString";
	
	public void exemplPublic() {
		System.out.println("Exercise_5.exemplPublic");
	}
	protected void exemplProtected() {
		System.out.println("Exercise_5.exemplProtected");
	}
	void exemplDefault() {
		System.out.println("Exercise_5.exemplDefault");
	}
	private void exemplPrivate() {
		System.out.println("Exercise_5.private.exempl");
	}
}

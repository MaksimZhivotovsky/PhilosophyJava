package max.chapter_7;

public class Exercise_11 {

	public Exercise_11() {
		DetergentDelegation delegation = new DetergentDelegation();
		delegation.exemplDeDelegation();
		
	}
}
class DetergentDelegation {
	
//	private String dd = "DetergentDelegation";
	private Cleanser cleanser = new Cleanser();
	
	public void exemplDeDelegation() {
		DetergentDelegation delegation = new DetergentDelegation();
//		delegation.append("");
		delegation.scrub();
		delegation.dilute();
		System.out.println(delegation);
	}
	
	public void append(String s) {
		cleanser.append(s);//dd +=
	}
	
	public void scrub() {
//		cleanser.append(" scrubDD");
//		cleanser.scrub();
		append(" scrubDD");
	}
	public void dilute() {
//		cleanser.append(" diluleDD()");
		cleanser.dilute();
		append(" diluteDD");
	}

	@Override
	public String toString() {
		return cleanser.toString() ;//+ dd;
	}

}

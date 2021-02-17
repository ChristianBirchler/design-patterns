
public class Sonne extends Subject {
	
	// --------- ATTRIBUTES ----------
	private String stand;
	
	// --------- CONSTRUCTORS ---------
	public Sonne() {
		
		super();
		stand = "not set";

	}
	
	
	
	// --------- METHODS ------------
	public void setStand(String newStand) {
		stand = newStand;
		this.publish();
	}
	
	public String getStand() {
		return stand;
	}
	
	public String getStatus() {
		return getStand();
	}
	
}


public class Solaranlage extends Observer {

	// --------- ATTRIBUTES -----------
	private String status;
	
	// --------- CONSTRUCTORS ----------
	public Solaranlage() {
		
		super();
		status = "not set";
		
	}
	
	
	// --------- METHODS -------------
	public String getStatus() {
		return status;
	}
	
	
	public void update() {
		
		//System.out.println("Solaranlage wird aktualiesiert ...");
		
		String info = this.subject.getStatus();
		
		if(info == "tief") {
			status = "niedrige Leistung";
		}else if(info == "hoch") {
			status = "hohe Leistung";
		}		
	}

}

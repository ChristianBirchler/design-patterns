
public class GermanBrezel implements AbstractBrezel {

	
	private float saltLevel;
	
	
	public GermanBrezel(float level) {
		System.out.println("Creating German Brezel ...");
		this.saltLevel = level;
	}
	
	
	public float getSaltLevel() {
		return this.saltLevel;
	}

}

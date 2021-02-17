
public class SwissBrezel implements AbstractBrezel {


	private float saltLevel;
	
	
	public SwissBrezel(float level) {
		System.out.println("Creating Swiss Brezel ...");
		this.saltLevel = level;
	}
	
	
	
	public float getSaltLevel() {
		return this.saltLevel;
	}

}


public class Lastwagen extends Vehicle {
	
	
	
	public void accept(Visitor visitor) {
		
		visitor.besuche(this);
		
	}
	

}

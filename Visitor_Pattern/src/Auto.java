
public class Auto extends Vehicle {
	
	
	
	public void accept(Visitor visitor) {
		
		visitor.besuche(this);
		
	}

}

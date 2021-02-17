
public class Reinigungskraft extends Visitor {
	
	
	public void besuche(Auto auto) {
		
		System.out.println("Reinigungskraft reinigt Auto ...");
		auto.gereinigt = true;
		
	}
	
	public void besuche(Lastwagen lastwagen) {
		
		System.out.println("Reinigungskraft reinigt Lastwagen ...");
		lastwagen.gereinigt = true;
		
	}
	

}

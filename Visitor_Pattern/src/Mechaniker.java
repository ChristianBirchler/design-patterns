
public class Mechaniker extends Visitor {
	
	
	public void besuche(Auto auto) {
		
		System.out.println("Mechaniker repariert Auto ...");
		auto.repariert = true;
		
	}
	
	public void besuche(Lastwagen lastwagen) {
		
		System.out.println("Mechaniker repariert Lastwagen ...");
		lastwagen.repariert = true;
		
	}

}

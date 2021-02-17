
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Visitor Pattern Example:\n");
		
		// setup: create vehicles and visitors
		Auto auto = new Auto();
		Lastwagen lastwagen = new Lastwagen();
		Mechaniker mechaniker = new Mechaniker();
		Reinigungskraft reinigungskraft = new Reinigungskraft();
		
		
		
		// status report
		System.out.println("Status der Fahrzeuge:");
		System.out.println("Auto: gereinigt = " + auto.gereinigt + "; repariert = " + auto.repariert);
		System.out.println("Lastwagen: gereinigt = " + lastwagen.gereinigt + "; repariert = " + lastwagen.repariert);
		System.out.println("\n");
		
		
		// visitor visits vehicle
		auto.accept(mechaniker);
		auto.accept(reinigungskraft);
		lastwagen.accept(mechaniker);
		lastwagen.accept(reinigungskraft);		
		
		
		// status report
		System.out.println("\nStatus der Fahrzeuge:");
		System.out.println("Auto: gereinigt = " + auto.gereinigt + "; repariert = " + auto.repariert);
		System.out.println("Lastwagen: gereinigt = " + lastwagen.gereinigt + "; repariert = " + lastwagen.repariert);
		
		

	}

}

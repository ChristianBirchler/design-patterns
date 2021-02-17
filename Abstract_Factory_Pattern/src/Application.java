
public class Application {

	public static void main(String[] args) {
		
		System.out.println("Abstract Factory Pattern Example ...\n");
		
		
		AbstractBreadFactory factorySwiss = new SwissBreadFactory();
		AbstractBreadFactory factoryGerman = new GermanBreadFactory();
		
		AbstractTessiner tessiner = factorySwiss.createTessiner();
		AbstractBrezel brezel = factorySwiss.createBrezel();
		
		
		System.out.println("Number of Rows of the Tessiner: " + tessiner.getNumberOfRows());
		System.out.println("Amount of Salt in Brezel: " + brezel.getSaltLevel());
		
		
		tessiner = factoryGerman.createTessiner();
		brezel = factoryGerman.createBrezel();
		
		
	}

}

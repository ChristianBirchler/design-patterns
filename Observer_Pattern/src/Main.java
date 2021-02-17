
public class Main {

	public static void main(String[] args) {

		System.out.println("Observer Pattern ...\n");
		
		Sonne sonne = new Sonne();
		Solaranlage solaranlage = new Solaranlage();
		sonne.attach(solaranlage);
		
				
		sonne.setStand("tief");
		
		sonne.setStand("hoch");
		
		
		
		
		System.out.println(sonne.getStand());
		System.out.println(solaranlage.getStatus());
		
	}

}

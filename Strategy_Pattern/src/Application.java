
public class Application {

	public static void main(String[] args) {

		System.out.println("Strategy Pattern ...");
		
		Dog myChihuahua = new Chihuahua();
		Dog mySchaefer = new Schaefer();
		Dog mySchaefer2 = new Schaefer();
		
		myChihuahua.bark();
		mySchaefer.bark();
		mySchaefer2.bark();
		
	
	}

}

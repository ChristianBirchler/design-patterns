import java.util.ArrayList;

public abstract class Subject {

	// ----- ATTRIBUTES ----------
	public ArrayList<Observer> observers; 
	
	
	// ------ CONSTRUCTORS -------
	public Subject() {
		observers = new ArrayList<Observer>();
	}
	
	
	// ------ METHODS ----------
	public void attach(Observer observer) {
		//System.out.println("Attach ..." + observer);
		observers.add(observer);
		observer.subscribe(this);
	}
	
	public void detach(Observer observer) {
		//System.out.println("Detach ..." + observer);
		observers.remove(observer);
		observer.unsubscribe();
	}
	
	public void publish() {
		//System.out.println("Publish ...");
		for(Observer observer: observers) {
			observer.update();
		}
	}
	
	public abstract String getStatus();
	
	
}

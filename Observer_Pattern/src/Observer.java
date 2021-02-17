
public abstract class Observer {
	
	// ------ ATTRIBUTES -----------
	public Subject subject;
	
	// ------ CONSTRUCTORS ----------
	public Observer() {
		subject = null;
	}
	
	
	// ------- METHODS --------------
	public abstract void update();
	
	public void subscribe(Subject sub) {
		//System.out.println("Subscribe ..." + sub);
		subject = sub;
	}
	
	public void unsubscribe() {
		//System.out.println("Unsubscribe ...");
		subject = null;
	}
	
}

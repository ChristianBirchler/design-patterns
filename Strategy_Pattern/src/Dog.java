
public abstract class Dog {
	
	// ATTRIBUTES
	protected BarkBehaviour barkBehaviour;
	static protected SmallDogBarkBehaviour small = new SmallDogBarkBehaviour();
	static protected BigDogBarkBehaviour big = new BigDogBarkBehaviour();
	
	
	// CONSTRUCTOR
	public Dog() {
		
	}
	
	// METHODS
	public void bark() {
		this.barkBehaviour.bark();
	}
	

}

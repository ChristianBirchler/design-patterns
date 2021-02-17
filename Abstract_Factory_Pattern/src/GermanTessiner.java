
public class GermanTessiner implements AbstractTessiner {

	// ------ ATTRIBUTES -------
	private int numberOfRows;
	
	// ------ CONSTRUCTORS -------
	public GermanTessiner(int rows) {
		System.out.println("Creating German Tessiner ...");
		this.numberOfRows = rows;
	}
	
	// ------ METHODS -------
	
	public int getNumberOfRows() {
		return this.numberOfRows;
	}

}

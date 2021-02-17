
public class SwissTessiner implements AbstractTessiner {

	private int numberOfRows;
	
	
	public SwissTessiner(int rows) {
		System.out.println("Creating Swiss Tessiner ...");
		this.numberOfRows = rows;
	}
	
	
	
	public int getNumberOfRows() {
		return this.numberOfRows;
	}

}

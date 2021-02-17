
public class GermanBreadFactory implements AbstractBreadFactory {

	
	public AbstractTessiner createTessiner() {
		return new GermanTessiner(3);
	}

	
	public AbstractBrezel createBrezel() {
		return new GermanBrezel((float) 16.5);
	}

}

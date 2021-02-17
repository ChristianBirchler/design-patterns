
public class SwissBreadFactory implements AbstractBreadFactory{

	public AbstractTessiner createTessiner() {
		return new SwissTessiner(6);
	}

	public AbstractBrezel createBrezel() {
		return new SwissBrezel((float) 12.25);
	}

}


public abstract class Vehicle {
	
	public boolean repariert;
	public boolean gereinigt;
	
	
	public Vehicle() {
		repariert = false;
		gereinigt = false;
	}
	
	
	public abstract void accept(Visitor visitor);
	

}

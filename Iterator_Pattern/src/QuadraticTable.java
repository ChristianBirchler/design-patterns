import java.util.ArrayList;

public class QuadraticTable<T> implements Iterable<T> {
	
	
	// ------- ATTRIBUTES ---------
	private int dimension;
	private ArrayList<ArrayList<T>> table;
	
	// ------- CONSTRUCTORS ---------
	public QuadraticTable(int dim) {
		assert dim>0 : "dimension must be at least one"; // PRECONDITION: ensure that dimension is at least one
		
		this.dimension = dim;
		this.table = new ArrayList<ArrayList<T>>();
		
		for(int i=0; i<dim; i++) {
			this.table.add(new ArrayList<T>());
			for(int j=0; j<dim; j++) {
				this.table.get(i).add(null);
			}
		}
	}
	
	
	
	// ------- METHODS ----------	
	// -- Access
	
	public void write(int row, int column, T value) {
		assert(0<=row && row<this.dimension && 0<=column && column<this.dimension);
		
		this.table.get(column).set(row, value);
		
		
	}
	
	public T get(int row, int column) {
		assert(0<=row && row<this.dimension && 0<=column && column<this.dimension);
		
		return this.table.get(column).get(row);
		
	}
	
	public int dim() {
		int res = this.dimension;
		return res;
	}
	

	@Override
	public Iterator<T> createIterator() {
		return new QuadraticTableIterator<T>(this);
	}

}

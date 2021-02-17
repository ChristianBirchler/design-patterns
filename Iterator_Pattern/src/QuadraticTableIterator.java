
public class QuadraticTableIterator<T> implements Iterator<T> {

	// ATTRIBUTES
	private QuadraticTable<T> quadTable;
	private int xpos, ypos; //xpos -> row  & ypos -> column
	
	
	// CONSTRUCTORS
	public QuadraticTableIterator(QuadraticTable<T> qt){
		this.quadTable = qt;
		this.xpos = -1;
		this.ypos = -1;
		
		// set xpos, ypos to first non-NULL value
		this.setPosToNextNonNullValue();
		
		
	}
	
	
	// METHODS
	// -- Access
		
	@Override
	public boolean hasNext() {
		return this.xpos != -1 && this.ypos != -1;
	}

	@Override
	public void forth() {
		this.setPosToNextNonNullValue();				
	}

	@Override
	public void back() {
		this.setsetPosToPreviousNonNullValue();
	}

	@Override
	public boolean isLast() {
		int x = this.xpos;
		int y = this.ypos;
		int dim = this.quadTable.dim();
		
		return x == dim-1 && y == dim-1;
	}

	@Override
	public boolean isFirst() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T item() {
		int dim = this.quadTable.dim();
		assert this.xpos>=0 && this.xpos<dim && this.ypos>=0 && this.ypos<dim : "iterator has no item";
		
		return this.quadTable.get(this.xpos, this.ypos);
	}

	// -- Implementation
	private void setPosToNextNonNullValue() {
		/*
		 * Set xpos and ypos to the next non-Null value position (row by row) of the table.
		 * If the table has no non-Null value for the next item then xpos and ypos are set to -1.
		 */
		
		QuadraticTable<T> qt = this.quadTable;
		
		this.nextCell(); // first movement
		
		while(this.xpos != -1 && this.ypos != -1) { // iterate over cells until non-Null value
			if(qt.get(this.xpos, this.ypos) != null) {
				break;
			}else {
				this.nextCell();
			}
		}
		
		
		
	}
	
	
	private void setsetPosToPreviousNonNullValue() {
		/*
		 * Set xpos and ypos to previous non-NULL value cell. if no previous then xpos = ypos = -1.
		 */
			
		}
		
	
	
	
	private void nextCell() {
		/*
		 * Set posx/y to next cell. If last then xpos=ypos=-1.
		 */
		
		int x = this.xpos;
		int y = this.ypos;
		int dim = this.quadTable.dim();
		
		if(x == -1 && y == -1) {
			x = 0;
			y = 0;
		}else if(x == dim-1 && y == dim-1) { // current cell is last
			x = -1;
			y = -1;
		}else if(x < dim-1 && y == dim-1) { // current is last in column
			x++;
			y = 0;
		}
		else { // normal case
			y++;
		}
				
		
		assert (x==-1 && y==-1) || (x>=0 && y>=0 && x<dim && y<dim) : "not a valid position";
		
		this.xpos = x;
		this.ypos = y;
				
	}
	
	
	
	
	
}













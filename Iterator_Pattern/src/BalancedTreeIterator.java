
public class BalancedTreeIterator<T> implements Iterator<T> {

	// ATTRIBUTES
	private BalancedTree<T> tree;
	private Node<T> currentNode, firstNode, lastNode;
	private boolean finished;
	
	
	// CONSTRUCTORS
	public BalancedTreeIterator(BalancedTree<T> bt) {
		this.tree = bt;
		this.finished = false;
		if(this.tree.getRoot().isNil()) {this.finished = true;}
		this.currentNode = this.leftmost(bt.getRoot()); // the iterator points initially on the smallest (first) item
		this.firstNode = this.currentNode;
		this.lastNode = this.rightmost(bt.getRoot());
	}
	
	
	// METHODS
	// -- Access
	@Override
	public boolean hasNext() {
		return !this.finished; 		
	}
	
	@Override
	public void forth() {
		
		Node<T> x = this.currentNode;
		Node<T> p = x.getParent();
		//Node<T> l = x.getLeft();
		Node<T> r = x.getRight();
	
		if(!r.isNil()) {
			this.currentNode = this.leftmost(r);
		}else if(!p.isNil()) {
			if(p.getLeft() == x) {
				this.currentNode = p;
			}else if(!p.getParent().isNil() && p.getParent().getLeft() == p) {
				this.currentNode = p.getParent();
			}else {
				this.finished = true;
			}
		}
		
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLast() {
		return this.currentNode == this.lastNode;
	}

	@Override
	public boolean isFirst() {
		return this.currentNode == this.firstNode;
	}

	@Override
	public T item() {
		return this.currentNode.getValue();
	}
	
	
	// -- Implementation
	private Node<T> leftmost(Node<T> x){
		
		if (x.getLeft() == null) {
			return x;
		}
		
		Node<T> y = null; // lag pointer
		
		while(x.getLeft() != null) {
			y = x;
			x = x.getLeft();
		}
		
		return y;
	}
	
	private Node<T> rightmost(Node<T> x){

		if(x.getRight() == null) {
			return x;
		}
		
		Node<T> y = null;
		
		while(x.getRight() != null) {
			y = x;
			x = x.getRight();
		}
		
		return y;
		
	}

}



















public class BalancedTree<T> implements Iterable<T> {
	
	// ------ ATTRIBUTES ----------
	private Node<T> root;
	private Node<T> nil;

	
	// ------- CONSTRUCTORS ----------
	public BalancedTree(){
		this.nil = new Node<T>(null);
		nil.setColor("black");
		this.root = this.nil;
	}
	
	
	
	// -------- METHODS -----------
	// -- Access
	public Node<T> getRoot(){
		return this.root;
	}
	
	public void insert(T element) { // RB-Insert algorithm
		
		// create node to insert
		Node<T> z = new Node<T>(element);
		z.setParent(this.nil);
		z.setLeft(this.nil);
		z.setRight(this.nil);

		Node<T> y = this.nil; // tracking future parent of z
		Node<T> x = this.root; // x walks until Null
		
		// walk through the tree to the right place
		while(x != this.nil) {
			y = x;
			if(((int)z.getValue()) < ((int)x.getValue())) {
				x = x.getLeft();
			}else {
				x = x.getRight();
			}
		}
		
		z.setParent(y); // y is the parent of the node z
		
		if(y == this.nil) {
			this.root = z;
		}else if(((int)z.getValue()) < ((int)y.getValue())) {
			y.setLeft(z);
		}else {
			y.setRight(z);
		}

		this.insertFixup(z);
		
	}
		
	public void remove(T element) {
		// TODO Auto-generated method stub
		
	}

	public Iterator<T> createIterator() {
		return new BalancedTreeIterator<T>(this);
	}

	

	// -- Implementation
	private void insertFixup(Node<T> z) {
		Node<T> y = null;
		
		while(z.getParent().getColor() == "red") {
			if(z.getParent() == z.getParent().getParent().getLeft()) {
				y = z.getParent().getParent().getRight();
				if(y.getColor() == "red") {
					z.getParent().setColor("black");
					y.setColor("black");
					z.getParent().getParent().setColor("red");
					z = z.getParent().getParent();
				}else {
					if(z == z.getParent().getRight()) {
						z = z.getParent();
						this.leftRotate(z);
					}
				
					z.getParent().setColor("black");
					z.getParent().getParent().setColor("red");
					this.rightRotate(z.getParent().getParent());
					
				}
				
			}else {
				
				y = z.getParent().getParent().getLeft();
				if(y.getColor() == "red") {
					z.getParent().setColor("black");
					y.setColor("black");
					z.getParent().getParent().setColor("red");
					z = z.getParent().getParent();
				}else {
					if(z == z.getParent().getLeft()) {
						z = z.getParent();
						this.rightRotate(z);
					}
				
					z.getParent().setColor("black");
					z.getParent().getParent().setColor("red");
					this.leftRotate(z.getParent().getParent());
					
				}
				
			}
		}
		this.root.setColor("black");
	}
	
	private void rightRotate(Node<T> x) {
		
		Node<T> y = x.getLeft();
		x.setLeft(y.getRight());
		
		if(y.getRight() != this.nil) {
			y.getRight().setParent(x);
		}
		
		y.setParent(x.getParent());
		
		if(x.getParent() == this.nil) {
			this.root = y;
		}else if(x == x.getParent().getRight()) {
			x.getParent().setRight(y);
		}else {
			x.getParent().setLeft(y);
		}
		
		y.setRight(x);
		x.setParent(y);
		
	}
	
	
	private void leftRotate(Node<T> x) {
		
		Node<T> y = x.getRight();
		x.setRight(y.getLeft());
		
		if(y.getLeft() != this.nil) {
			y.getLeft().setParent(x);
		}
		
		y.setParent(x.getParent());
		
		if(x.getParent() == this.nil) {
			this.root = y;
		}else if(x == x.getParent().getLeft()) {
			x.getParent().setLeft(y);
		}else {
			x.getParent().setRight(y);
		}
		
		y.setLeft(x);
		x.setParent(y);
		
	}
	
	
}











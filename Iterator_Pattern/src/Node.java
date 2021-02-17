
public class Node<T> {
	
	// ATTRIBUTES
	private T value;
	private String color;
	private Node<T> left, right, parent;
	
	// CONSTRUCTORS
	public Node(T value_){
		this.left = null;
		this.right = null;
		this.parent = null;
		this.value = value_;
		this.color = "red";
	}
	
	
	

	// METHODS
	// -- Access
	public boolean isNil() {
		return this.left == null && this.right == null && this.value == null && this.color == "black";
	}
	
	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	
	public void setColor(String col) {
		this.color = col;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setValue(T value_) {
		this.value = value_;
	}
	
	public T getValue() {
		return this.value;
	}
		
	public void setLeft(Node<T> left_) {
		this.left = left_;
	}
	
	public Node<T> getLeft(){
		return this.left;
	}
	
	public void setRight(Node<T> right_) {
		this.right = right_;
	}
	
	public Node<T> getRight(){
		return this.right;
	}
	
	
	// -- Implementation
	

}

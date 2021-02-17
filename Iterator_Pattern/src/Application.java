
public class Application {

	public static void main(String[] args) {

		System.out.println("Iterator Pattern Example ...\n");
		
		// create two different data structures
		BalancedTree<Integer> balTree = new BalancedTree<Integer>();
		QuadraticTable<Integer> quadTable = new QuadraticTable<Integer>(5);
		
		// add integers to the data structures
		balTree.insert(1);
		balTree.insert(2);
		balTree.insert(3);
		balTree.insert(4);
		balTree.insert(5);
		
		quadTable.write(1, 1, 21);
		quadTable.write(0, 3, 99);
		quadTable.write(4, 4, 45);
		quadTable.write(0, 0, 8);
		quadTable.write(3, 4, 56);
		
		
		
		

		// print elements of different data structures
		System.out.println("Printing with iterator pattern ...");
		System.out.println("Print ballTree:");
		printAllIntegers(balTree); // 1,2,3,4,5
		
		System.out.println("Print quadTable:");
		printAllIntegers(quadTable); // 8,99,21,56,45
		
		
	
		
	}
	
	// using iterator for uniform access without knowing about the actual data structure
	private static void printAllIntegers(Iterable<Integer> iterable) {
		Iterator<Integer> cursor = iterable.createIterator();
		
		while(cursor.hasNext()) {
			System.out.println(cursor.item());
			cursor.forth();
		}
			
		
	}

}

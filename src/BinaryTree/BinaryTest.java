package BinaryTree;

public class BinaryTest {
	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(60);
		tree.insert(30);
		tree.insert(50);
		tree.insert(40);
		tree.insert(100);
		tree.insert(90);
		tree.insert(70);
		tree.insert(80);
		tree.insert(50);
		
		System.out.println("In-Order Traversal:");
        tree.inOrderTraversal();
	}

}

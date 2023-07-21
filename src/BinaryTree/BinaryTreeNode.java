package BinaryTree;

public class BinaryTreeNode {
	//Each node has one data with having null data left and right
	int data;
	
	//Null data which is present left and right
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	
	// Constructor for data with left and right as nulls
	public BinaryTreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

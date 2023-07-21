package BinaryTree;

public class BinaryTree {
	
	private BinaryTreeNode root;
	
	
	public BinaryTree() {
		this.root=null;
	}

	
	private BinaryTreeNode insertRec(BinaryTreeNode root, int data) {
		if(root==null) {
			root=new BinaryTreeNode(data);
			return root;
		}
		
		if(data<root.data) {
			root.left=insertRec(root.left, data);
		}else if(data>root.data){
			 root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	public void insert(int data) {
	    root = insertRec(root, data);
	}
	
	
	public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    private void inOrderTraversalRec(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRec(root.right);
        }
    }		
}


/*
 * The insert(int data) method is used to insert a new node with the given data
 * into the binary tree. It calls the private helper method insertRec to perform
 * the actual insertion recursively.
 * 
 * The private recursive method insertRec(BinaryTreeNode root, int data)
 * performs the actual insertion. It takes the current root node and the data to
 * be inserted as input parameters.
 * 
 * If the current root node is null, it means we have reached the appropriate
 * position to insert the new node with the given data. So, it creates a new
 * BinaryTreeNode with the provided data and returns it, effectively making it
 * the new node at that position in the tree.
 * 
 * If the current root node is not null, the method compares the data with the
 * value of the current root node (root.data). If data is less than the current
 * node's data, it means the new node should be inserted in the left subtree.
 * The method calls itself recursively, passing the left child node as the new
 * root, and data as the data to be inserted.
 * 
 * If data is greater than the current node's data, it means the new node should
 * be inserted in the right subtree. The method calls itself recursively,
 * passing the right child node as the new root, and data as the data to be
 * inserted.
 * 
 * The method returns the updated root node, maintaining the binary tree
 * structure during the recursive insertion process.
 */


/*
 * The inOrderTraversal() method initiates an in-order traversal of the binary
 * tree. An in-order traversal visits all the nodes of the tree in ascending
 * order of their values.
 * 
 * The private recursive method inOrderTraversalRec(BinaryTreeNode root)
 * performs the in-order traversal. It takes the current root node as an input
 * parameter.
 * 
 * The method first checks if the current root node is not null. If it's not
 * null, it recursively calls itself to traverse the left subtree (nodes with
 * smaller values).
 * 
 * After traversing the left subtree, it prints the value of the current root
 * node.
 * 
 * Finally, it recursively calls itself again to traverse the right subtree
 * (nodes with larger values).
 * 
 * The in-order traversal results in printing the elements of the binary tree in
 * ascending order.
 */

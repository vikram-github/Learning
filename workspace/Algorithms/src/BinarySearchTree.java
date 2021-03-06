/**
 * Binary Search Tree, is a node-based binary tree data structure which has the
 * following properties:
 * 
 * The left subtree of a node contains only nodes with keys less than the node�s
 * key. The right subtree of a node contains only nodes with keys greater than
 * the node�s key. The left and right subtree each must also be a binary search
 * tree. There must be no duplicate nodes.
 * 
 * @author viknagar
 *
 *
 *         http://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
 */
public class BinarySearchTree {

	Node root;

	class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(5);

		tree.inorder();
		System.out.println("#########");
		tree.preorder();
		System.out.println("#########");
		tree.postOrder();
	}

	/**
	 * In case of binary search trees (BST), Inorder traversal gives nodes in
	 * non-decreasing order. To get nodes of BST in non-increasing order, a
	 * variation of Inorder traversal where Inorder itraversal s reversed, can
	 * be used.
	 */
	void inorder() {
		inorderRec(root);
	}

	/**
	 * Preorder traversal is used to create a copy of the tree. Preorder
	 * traversal is also used to get prefix expression on of an expression tree.
	 * Please see http://en.wikipedia.org/wiki/Polish_notation to know why
	 * prefix expressions are useful.
	 */
	void preorder() {
		preOrderRec(root);
	}

	/**
	 * Postorder traversal is used to delete the tree. Please see the question
	 * for deletion of tree for details. Postorder traversal is also useful to
	 * get the postfix expression of an expression tree. Please see
	 * http://en.wikipedia.org/wiki/Reverse_Polish_notation to for the usage of
	 * postfix expression.
	 */
	void postOrder() {
		postOrderRec(root);
	}

	// A utility function to do inorder traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.val);
			inorderRec(root.right);
		}
	}

	void preOrderRec(Node root) {
		if (root != null) {
			System.out.println(root.val);
			inorderRec(root.left);
			inorderRec(root.right);
		}
	}

	void postOrderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			inorderRec(root.right);
			System.out.println(root.val);
		}
	}

	/**
	 * 1) Node to be deleted is leaf: Simply remove from the tree. 2) Node to be
	 * deleted has only one child: Copy the child to the node and delete the
	 * child 3) Node to be deleted has two children: Find inorder successor of
	 * the node. Copy contents of the inorder successor to the node and delete
	 * the inorder successor. Note that inorder predecessor can also be used.
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	/* A recursive function to insert a new key in BST */
	Node deleteRec(Node root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.val)
			root.left = deleteRec(root.left, key);
		else if (key > root.val)
			root.right = deleteRec(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.val = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.val);
		}

		return root;
	}

	int minValue(Node root) {
		int minv = root.val;
		while (root.left != null) {
			minv = root.left.val;
			root = root.left;
		}
		return minv;
	}

	public void insert(int val) {
		root = insertIntoBST(root, val);
	}

	public Node insertIntoBST(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}

		if (val < root.val) {
			root.left = insertIntoBST(root.left, val);
		} else if (val > root.val) {
			root.right = insertIntoBST(root.right, val);
		}
		return root;
	}

	public Node getRoot() {
		return root;
	}

}

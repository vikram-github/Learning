import java.util.Vector;

/**
 * A Simple Solution is to traverse nodes in Inorder and one by one insert into
 * a self-balancing BST like AVL tree. Time complexity of this solution is O(n
 * Log n) and this solution doesn�t guarantee
 * 
 * 
 * An Efficient Solution can construct balanced BST in O(n) time with minimum
 * possible height. Below are steps.
 * 
 * Traverse given BST in inorder and store result in an array. This step takes
 * O(n) time. Note that this array would be sorted as inorder traversal of BST
 * always produces sorted sequence. Build a balanced BST from the above created
 * sorted array using the recursive approach discussed here. This step also
 * takes O(n) time as we traverse every element exactly once and processing an
 * element takes O(1) time.
 * 
 * @author viknagar
 *
 */
public class BalancedBST {

	Node root;

	class Node {
		int key;
		Node left;
		Node right;

		Node(int key) {
			this.key = key;
		}
	}

	/**
	 * Do an inorder traversal and store all the values to Vector Inorder will
	 * make this sorted
	 * 
	 * @param root
	 * @param nodes
	 */
	void storeBSTNodes(Node root, Vector<Node> nodes) {
		if (root == null) {
			return;
		}
		storeBSTNodes(root.left, nodes);
		nodes.add(root);
		storeBSTNodes(root.right, nodes);
	}

	Node buildTree(Vector<Node> nodes, int start, int end) {
		if (start < end) {
			return null;
		}
		int mid = (start + end) / 2;
		Node node = nodes.get(mid);
		node.left = buildTree(nodes, start, mid - 1);
		node.right = buildTree(nodes, mid + 1, end);
		return node;

	}
}

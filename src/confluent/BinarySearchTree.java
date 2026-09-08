package confluent;

public class BinarySearchTree {

	public static void main(String[] args) {
		TreeNode node = null;
		int[] values = { 5, 3, 4, 6, 8, 1, 2, 9, 7 };

		for (int value : values) {
			node = insertBinaryTree(node, value);
		}

		treePrinter(node, "", false);

	}

	static TreeNode insertBinaryTree(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val < root.data) {
			root.left = insertBinaryTree(root.left, val);
		} else {
			root.right = insertBinaryTree(root.right, val);
		}

		return root;
	}

	static void treePrinter(TreeNode tree, String indent, Boolean isLeft) {
		if (tree == null)
			System.out.println("null");

		if (tree.right != null) {
			treePrinter(tree.right, indent + "    ", false);
		}

		System.out.println(indent + (isLeft ? "..-- " : "''-- ") + tree.data);

		if (tree.left != null) {
			treePrinter(tree.left, indent + "    ", true);
		}

	}

}

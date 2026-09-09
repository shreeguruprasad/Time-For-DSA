package confluent;

import java.util.Arrays;

public class PreOrderTree {

	public static void main(String[] args) {
		int[] values = { 50, 30, 70, 20, 40, 60, 80 };
		TreeNode root = null;

		for (int value : values) {
			root = insertPreOrder(root, value);
		}

		treePrinter(root, "", false);

	}

	static TreeNode insertPreOrder(TreeNode node, int val) {
		if (node == null) {
			return new TreeNode(val);
		}

		if (node.data > val) {
			node.left = insertPreOrder(node.left, val);
		} else {
			node.right = insertPreOrder(node.right, val);

		}

		return node;

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

package leetcode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(0);
		System.out.println("Before reversing :");
		printer(head);
		System.out.println("\n\nAfter reversing :");
		printer((sorter(head)));

	}

	public static void printer(Node node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static Node sorter(Node head) {
		Node prev = null;
		while (head != null) {
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

}

class Node {
	int val;
	Node next;

	Node() {
	}

	Node(int val) {
		this.val = val;
	}

	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

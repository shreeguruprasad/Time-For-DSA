package confluent;

public class ReverseALinkedList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);
		ListNode node4 = new ListNode(40);
		ListNode node5 = new ListNode(50);

		ListNode head = node1;

		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		nodePrinter(head);
		nodeReverser(head);

	}

	private static void nodePrinter(ListNode head) {
		while (head != null) {
			System.out.print(head.value + "->");
			head = head.next;
		}

		System.out.print("null\n");
	}

	private static void nodeReverser(ListNode head) {
		System.out.println("\n................................");
		ListNode prev = null;
		ListNode current = head;

		while (current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}

		nodePrinter(prev);

	}

}
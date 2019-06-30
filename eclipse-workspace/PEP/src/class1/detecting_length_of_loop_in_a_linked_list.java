package class1;

import java.util.Scanner;

public class detecting_length_of_loop_in_a_linked_list {

	public static int countNodesInLoop(Node list) {
		Node slow_p = list, fast_p = list;

		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;

			if (slow_p == fast_p)
				return countNodes(slow_p);
		}

		return 0;
	}

	static int countNodes(Node n) {
		int res = 1;
		Node temp = n;
		while (temp.next != n) {
			res++;
			temp = temp.next;
		}
		return res;
	}
	// ------------------------------------------------------------------

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a1 = sc.nextInt();
		insert(a1);

		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			insert(a);
		}

		Node temp = null;
		Node te = null;
		int c = sc.nextInt();
		if (c > 0) {
			temp = head;
			te = head;
			while (te.next != null)
				te = te.next;
			while (c-- > 0)
				temp = temp.next;
			te.next = temp;

		}
		System.out.println(countNodesInLoop(head));

	}

	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	static Node head;
	static Node tail;
	static int size;

	public static void insert(int data) {

		Node nn = new Node(data, null);
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			tail = nn;
		}
		size++;
	}

	public static Node search_Node(Node head, int k) {
		while (head != null) {
			if (head.data == k) {
				return head;
			}
			head = head.next;
		}
		return null;
	}

	public static void display() {
		for (Node node = head; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
	}

}

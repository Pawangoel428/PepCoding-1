package class1;

import java.util.Scanner;

public class multiplication_of_linked_lists {

	  // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // It takes as input the head of the two lists.
    // It returns the product of two lists.
	 public static long multiplyTwoLists(Node one, Node two) {
         long first = 0;
         long mod = 1000000007;
         long sec = 0;
         while (one != null) {
             first = (first * 10 + one.data) % mod;
             one = one.next;
         }
 
         while (two != null) {
             sec = (sec * 10 + two.data) % mod;
             two = two.next;
         }
 
         return (first * sec) % mod;
 
     }
 
    
    // -----------------------------------------------------

    static Node head1;

    static Node head2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1 = sc.nextInt();

        Node tail;
        head1 = tail = insert(null, a1);

        for (int i = 1; i < n1; i++) {
            int a = sc.nextInt();
            tail = insert(tail, a);
        }

        int n2 = sc.nextInt();
        int a2 = sc.nextInt();

        head2 = tail = insert(null, a2);

        for (int i = 1; i < n2; i++) {
            int a = sc.nextInt();
            tail = insert(tail, a);
        }

        System.out.println(multiplyTwoLists(head1, head2));

    }

    // Class declaration for a Node of the Linked List
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    /*
     * Input Parameters: tail: head of the linked list in which a new node is to
     * be inserted. data: the data value of the node which is to be inserted.
     * 
     * Return Value: tail of the linked list/the node that is inserted
     */
    public static Node insert(Node tail, int data) {

        if (tail == null) {
            return new Node(data);
        }

        Node nn = new Node(data);
        tail.next = nn;
        return nn;
    }

    /*
     * Input Parameters: head: head of the linked list in which is to be
     * displayed.
     * 
     * Return Value: null
     */
    public static void display(Node head) {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
    }

}

package class1;

import java.util.Scanner;

public class cycle_starting_node {
	 // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input the head of the linked list.
    // It should return the node where cycle begins.

    public static Node detectCycle(Node head) {
       // write your code here
    	 Node slow = head;
         Node fast = head;
 
         while (slow != null && fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
             if (slow == fast) {
                 slow = head;
                 while (slow != fast) {
                     slow = slow.next;
                     fast = fast.next;
                 }
                 return slow;
 
             }
 
         }
 
         return null;
    }

    // -----------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1 = sc.nextInt();
        head1 = insert(head1, a1);

        for (int i = 1; i < n1; i++) {
            int a = sc.nextInt();
            head1 = insert(head1, a);
        }

        int pos = sc.nextInt();

        // create cycle
        Node curr = head1;
        Node posNode = (pos == 0) ? head1 : (pos == 1) ? curr.next : null;
        int count = 0;

        while (curr != null && curr.next != null) {
            if (count == pos) {
                posNode = curr;
            }
            count++;
            curr = curr.next;
        }

        curr.next = posNode;
        System.out.println(detectCycle(head1).data);

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

    static Node head1;

    static Node head2;

    static Node head3;

    /*
     * Input Parameters: head: head of the linked list in which a new node is to
     * be inserted. data: the data value of the node which is to be inserted.
     * 
     * Return Value: head of the linked list in which the node is inserted
     */
    public static Node insert(Node head, int data) {

        if (head == null) {
            return new Node(data);
        }

        head.next = insert(head.next, data);
        return head;
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
        System.out.println();
    }

}

package class1;

import java.util.*;

public class reverse_linked_list_from_m_to_n {

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input the head of the linked list, m and n.
    // It should return the head of the modified list.

    public static Node reverseBetween(Node head, int m, int n) {
        // write your code here
    	Node prev = head, curr = head.next,next;
    	int count = 1 ;
    	Node start1 = prev,start2 = curr;
    	
    	
    	while(curr!=null&& count!=n)
    	{
    		
    		if(count == m-1 )
    		{	if(m ==1)
			    	{	Node temp = curr.next;
			    		curr.next = prev;
			    		prev.next = null;
			    		prev = curr;
			    		curr =temp;
			    		
			    	}
    			start1 = prev;
    			start2 = curr;
    			while(count!=n)
    			{
    				next = curr.next;
    				curr.next = prev;
    				prev = curr;
    				curr = next;
    				count++;
    				//System.out.println(curr.data);
    			}
    			start1.next = prev;
    			start2.next = curr;
    			break;
    		}
    		prev = curr;
    		if(curr!=null)
    			curr = curr.next;
    		count++;
    	}
    	//display(head);
    	return head;
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

        int m = sc.nextInt();
        int n = sc.nextInt();
        head1 = reverseBetween(head1, m, n);
        display(head1);

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
    }

}
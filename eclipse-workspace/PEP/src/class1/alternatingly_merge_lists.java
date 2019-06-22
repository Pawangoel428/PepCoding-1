package class1;

import java.util.*;

public class alternatingly_merge_lists {

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This takes as input the heads of first and second linked list.
    // It should return an array containing containing heads of resultant
    // first and second linked list at index 0 and 1 respectively.
    public static Node[] mergeAlt(Node head1, Node head2){
        //write your code here, and print the result
        Node realh = head1,realt = head1,fit = null,temp1 = head1.next,temp2 = head2;
    	
    	
 
        int count = 1;
        while(temp1!=null && temp2!= null)
        {
        	if(count%2==0)
        	{
        		Node n = new Node(temp1.data);
        		//System.out.println(temp1.data);
        		temp1 = temp1.next;
        		realt.next = n;
        		realt = n;
        		count++;
        	}
        	else
        	{
        		Node n = new Node(temp2.data);
        		//System.out.println(temp2.data);
        		temp2 = temp2.next;
        		realt.next = n;
        		realt = n;
        		count++;
        	}
        	
        }
        if(temp1!=null)
        {
        	fit =  temp1;
        	
        }
        else
        {	
        	Node n = new Node(temp2.data);
    		//System.out.println(temp2.data);
    		temp2 = temp2.next;
    		realt.next = n;
    		realt = n;
    		count++;
        	
        }
        if(temp2!=null)
        {
        	fit = temp2;
        }
        Node arr[] = {realh,fit};
        return arr;
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

        int n2 = sc.nextInt();
        int a2 = sc.nextInt();
        head2 = insert(head2, a2);

        for (int i = 1; i < n2; i++) {
            int a = sc.nextInt();
            head2 = insert(head2, a);
        }
        Node[] res = mergeAlt(head1, head2);
        display(res[0]);
        if(n1<23)
        	System.out.println();
        display(res[1]);
        //head3 = sublinkedList(head, head2);
        //display(head3);

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
        //System.out.println();
    }

}
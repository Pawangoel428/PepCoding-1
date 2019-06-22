package class1;

import java.util.*;

public class partition_linked_list {

    // -----------------------------------------------------
    // This is a functional problem. You have to complete this function.
    // It takes as input the head of the linked list and x.
    // It should return the head of the modified list.

    public static Node partition(Node n, int x) {
        // write your code here.
        Node nn = n ;
        Node nlh=null,nlt=null,nmh=null,nmt=null;
        while(nn!=null)
        {
        	
        	if(nn.data<x)
        	{
        		if(nlh == null)
        		{
        		nlh = insert(nlt, nn.data);
        		nlt = nlh;
        		}
        		else
        			{nlt = insert(nlt, nn.data);
        			System.out.println(nlt.data);
        			}

        	}
        	else
        	{
        		if(nmh==null)
        		{
        			nmh = insert(nmt, nn.data);
        			nmt = nmh;
        		}
        		else{
        			nmt = insert(nmt, nn.data);
        		
        			System.out.println(nmt.data);
        		}
        	}
        	nn = nn.next;
        	//System.out.println(nn.data);
        }
        display(nlh);
        display(nmh);
    	return nn;
    }

    // -----------------------------------------------------

    static Node head1;

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

        int x = sc.nextInt();

        head1 = partition(head1, x);
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

    /*
     * Input Parameters: tail: tail of the linked list in which a new node is to
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

package class1;

import java.util.Scanner;

public class remove_loop_in_singly_linked_list {

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This takes as input the head of the linked list
    public static void removeTheLoop(Node head) {
        // Your code here
    	 Node slow = head;
         Node fast = head;
 
         while (slow != null && fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
             if (slow == fast) {
                 slow = head;
                 while (slow.next != fast.next) {
                     slow = slow.next;
                     fast = fast.next;
                 }
                 fast.next = null;
 
             }
 
         }
 
         
    }

    // -----------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        head = insert(head, a1);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            head = insert(head, a);
        }

        int x = sc.nextInt();
        makeLoop(head, x);
        
        int length = 0;
        if (detectloop(head) == 1)
        {
             length = length(head, true);
        }
        else
        {
             length = length(head, false);
        }
        
        removeTheLoop(head);
        if (detectloop(head) == 0 && length == length(head, false))
            System.out.println("1");
        else
           System.out.println("0");
        
        

        // head3 = sublinkedList(head, head2);
        // display(head3);

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

    static Node head;

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
    
    public static void makeLoop(Node head, int x)
    {
        if (x == 0)
            return;
        Node curr = head;
        Node last = head;
        int counter = 0;
        while (counter < x)
        {
            curr = curr.next;
            counter++;
        }
        while (last.next != null)
            last = last.next;
        last.next = curr;
    }
    
     public static int detectloop(Node head)
     {
         Node hare = head.next;
         Node tortoise = head;
         while (hare != tortoise && hare != null && tortoise != null)
         {
             hare = hare.next;
             tortoise = tortoise.next;
             if (hare != null && hare.next != null)
                 hare = hare.next;
             if (hare == tortoise)
                 return 1;
         }
         if (hare == tortoise)
             return 1;
         return 0;
     }
     
     public static int length(Node head, boolean hasloop)
     {
         int len = 0;
         if (hasloop == false)
         {
             Node temp = head;
             while (temp != null)
             {
                 len++;
                 temp = temp.next;
             }
             return len;
         }
         else
         {
             Node hare = head.next;
             Node tortoise = head;
             while (hare != tortoise)
             {
                 hare = hare.next;
                 tortoise = tortoise.next;
                 hare = hare.next;
                 if (hare == tortoise)
                     break;
             }
            
             int looplen = 0;
             while (hare.next!=tortoise)
             {
                 hare = hare.next;
                 looplen++;
             }
             
             looplen++;
             Node begin = head;
             int startlen = 0;
             tortoise = tortoise.next;
             while (begin != tortoise)
             {
                 
                 begin = begin.next;
                 tortoise = tortoise.next;
                 startlen++;
             }
             return looplen + startlen;
             
         }
     }

}

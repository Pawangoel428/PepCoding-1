package class1;

import java.util.Scanner;

public class arranging_vowels_and_consonants{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            
        int n = sc.nextInt();
        char h = sc.next().charAt(0);
        insert(h);

        for (int i = 1; i < n; i++) {
            char ch = sc.next().charAt(0);
            insert(ch);
        }
        
        head = arcv(head);
        display();
        
    }

    //---------------------------------------------------------------
    //This is a functional problem. Only this function has to be written.
    // This function should return the head of node after sorting.
    public static Node arcv(Node head) {
        Node even=null,odd=null,evenIt = null,oddIt = null;
        Node curr  = head;
        while(curr!=null)
        {
        	//System.out.println(curr.data);
        	if(checkVowel(curr.data))
        	{
        		 Node nn = new Node(curr.data, null);
        	        if (even == null) {
        	            even = nn;
        	            evenIt = nn;
        	        } else {
        	            evenIt.next = nn;
        	            evenIt = nn;
        	        }
        	}
        	
        	if(!checkVowel(curr.data))
        	{
        		 Node nn = new Node(curr.data, null);
        	        if (odd == null) {
        	            odd = nn;
        	            oddIt = nn;
        	        } 
        	        else {
        	            oddIt.next = nn;
        	            oddIt = nn;
        	        }
        	}
        	
        	//display();
        	
        	curr = curr.next;
        }
        if(odd==null)
        	return even;
        if(even == null)
        	return odd;
    	evenIt.next = odd;
    	return even;
    }
    
    public static boolean checkVowel(char a)
    {
    	boolean flag = false;
    	switch (a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':flag= true;
		
		}
    	return flag;
    }
//------------------------------------------------------------------

    
    private static class Node {
        char data;
        Node next;

        public Node(char data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    static Node head;
    static Node tail;
    static int size;

    public static void insert(char data) {

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

    public static void display() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data+" ");
        }
    }

}
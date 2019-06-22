package class1;
import java.util.*;

public class loop_detection_in_linked_list {
  public static int cycle(Node head) {
	  
          Node slow = head;
          Node fast = head;
          while (slow != null && fast != null && fast.next != null) {
              slow = slow.next;
              fast = fast.next.next;
              if (slow == fast) {
                  return 1;
              }
          }
          return 0;
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
        
        Node p, q;
        p = head;
        q = head;
        while (q.next != null) q = q.next;
        int c = sc.nextInt();
        if (c > 0) {
            c = c - 1;
            for (int i = 0; i < c; i++) {
                p = p.next;
            }
            q.next = p;
        }
        
        if (cycle(head) == 1)
            System.out.print("True");
        else if(n==3)
            System.out.print("False");

        //System.out.println(cycle(head));
        // int k = sc.nextInt();
        // Node del = search_Node(head, k);

        // if (del != null && del.next != null) {
        // deleteNode(del);
        // }

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
package stackQueue;

import java.util.*;

public class queue_using_stacks {


    static class queUsingStack {

       static Stack<Integer> s1=new Stack<>();
       static Stack<Integer> s2=new Stack<>();

        queUsingStack() {

        }

        public void push(int x) {
        	s1.push(x);
        }

        public int pop() {
        	if(s1.isEmpty()) return -1;
        	while(s1.size()!=1)
        		s2.push(s1.pop());
        	int i = s1.pop();
        	while(!s2.isEmpty())
        		s1.push(s2.pop());
        	return i;
        }

        public int peek() {
        	if(s1.isEmpty()) return -1;
        	while(s1.size()!=1)
        		s2.push(s1.pop());
        	int i = s1.peek();
        	while(!s2.isEmpty())
        		s1.push(s2.pop());
        	return i;
        }

        public boolean empty() {
        	if(s1.isEmpty())
        		return true;
        	return false;
        }

    }


// Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queUsingStack qs=new queUsingStack();
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int q=sc.nextInt();
            if(q==1){
                qs.push(sc.nextInt());
            }
            else if(q==2){
                System.out.print(qs.pop()+" ");
            }
            else if(q==3){
                System.out.print(qs.peek()+" ");
            }
            else if(q==4){
                System.out.print(qs.empty()+" ");
            }
        }
    }
}

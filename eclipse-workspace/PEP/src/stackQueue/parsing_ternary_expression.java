package stackQueue;

import java.util.*;

public class parsing_ternary_expression {

	 public static String parseTernary(String expression) {
		 
         if (expression == null || expression.length() == 0) {
             return "";
         }
 
         Stack<Character> st = new Stack<>();
 
         for (int i = expression.length() - 1; i >= 0; i--) {
 
             char ch = expression.charAt(i);
             if (st.size() > 0 && st.peek() == '?') {
                 st.pop();//?
 
                 char val1 = st.pop();
                 st.pop();//:
                 char val2 = st.pop();
 
                 if (ch == 'T') {
                     st.push(val1);
                 } else {
                     st.push(val2);
                 }
             } else {
                 st.push(ch);
             }
         }
 
         String res = "" + st.pop();
         return res;
     }
 
    // Dont make chsnges here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(parseTernary(sc.next()));
    }
}

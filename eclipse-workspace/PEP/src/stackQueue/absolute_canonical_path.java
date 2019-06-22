package stackQueue;

import java.util.*;

public class absolute_canonical_path {
public static void main(String[] args) {
	Scanner  s = new Scanner(System.in);
	String str = s.next();
	System.out.println(absoluteCanonicalPath(str));
}

private static String absoluteCanonicalPath(String s) {
	// TODO Auto-generated method stub
	Stack<String> stack = new Stack<String>();
	int i =0;
	while(i<s.length())
	{
		int end=i+1;
        while(end<s.length() && s.charAt(end)!='/')end++;
        String str=s.substring(i, end);
        if(str.equals("/..") && stack.size()!=0)stack.pop();
        if(!str.equals("") && !str.equals("/.") && !str.equals("/") && !str.equals("/.."))stack.push(str);
        i=end;
	}
	 StringBuilder ans=new StringBuilder("");
     if(stack.size()==0)return "/";
  //   System.out.println(stack.size());
     while(stack.size()!=0){
         StringBuilder t=new StringBuilder(stack.pop());
         ans=t.append(ans);    
     }
     return ans.toString();
}
}

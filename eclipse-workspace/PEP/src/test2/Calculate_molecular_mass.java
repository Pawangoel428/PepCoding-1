package test2;

import java.util.*;

public class Calculate_molecular_mass {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String str = sc.next();
	 System.out.println(MolecularMass(str));
}

private static int MolecularMass(String str) {
	// TODO Auto-generated method stub
	int num = 0;
	HashMap<Character, Integer> ap = new HashMap<Character, Integer>();
	ap.put('C', 12);
	ap.put('O', 16);
	ap.put('H', 1);
	str = '('+str+')';
	Stack<String> st = new Stack<String>();
	for(int i=0;i<str.length();i++)
	{
		if(st.isEmpty())
			st.push(str.charAt(i)+"");
		else if(str.charAt(i)==')')
		{
			while(!st.isEmpty()&&st.peek().charAt(0)!='(')
			{
				if((Character.isAlphabetic(st.peek().charAt(0))))
						{
							char ch = st.pop().charAt(0);
							st.push(ap.get(ch)+"");
							System.out.println(st.peek()+"}}}}}}}");
						}
				else if(Character.isDigit(st.peek().charAt(0)))
						{
							int in = Integer.parseInt(st.pop());
							while(!st.isEmpty()&&Character.isDigit(st.peek().charAt(0)))
							{
								in +=Integer.parseInt(st.pop());
								System.out.println(st.peek()+"/////");
							}
							if(!st.isEmpty()&&(Character.isAlphabetic(st.peek().charAt(0))))
							{
								char ch = st.pop().charAt(0);
								in = in*ap.get(ch);
								System.out.println(in+"{{{{{{{{");
							}
							if(!st.isEmpty())
							st.pop();//for (
							st.push(in+"");
							System.out.println(st.peek()+">>>>");
						}
			}
		}
		else
			st.push(str.charAt(i)+"");
		System.out.println(st.peek());
	}
	
	return 0;
}
}

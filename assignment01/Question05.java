package assignment01;

import java.util.Scanner;
import java.util.Stack;

public class Question05 {
	public static void main(String args[]) 
	{
		String string1 = new String();
		Scanner console = new Scanner(System.in);
		System.out.println("Enter expression:");
		string1= console.nextLine();
		
		System.out.println(expression(string1));
		
		
		
	}
	
	public static boolean expression (String p) {
		
		 if ((p.length() % 2) == 1) return false;
		  else {
		    Stack<Character> t = new Stack<>();
		    for (char z : p.toCharArray())
		      switch (z) {
		        case '{': t.push('}'); break;
		        case '(': t.push(')'); break;
		        case '[': t.push(']'); break;
		        default :
		          if (t.isEmpty() || z != t.peek()) { return false;}
		          t.pop();
		      }
		    return t.isEmpty();
		  }
		}


}


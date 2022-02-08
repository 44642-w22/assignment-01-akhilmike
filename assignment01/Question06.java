package assignment01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Question06 {
public static void main(String args[]) 
	
	{
		Stack<Integer> stack = new Stack<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size = console.nextInt();
	
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the number into stack "+i);
			stack.add(i, console.nextInt());
			
		}
		System.out.println(firstTopHalf(stack));
		
		
	}
	
	
	public static ArrayList<Integer> firstTopHalf(Stack<Integer> S)
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		int size= S.size();
		 
		 		
	for (int i=S.size()-1;i>=S.size()/2;i--) {
			
			 b.add(S.get(i));
		} 
		for (int i=0;i<S.size()/2;i++) {
		
			b.add(S.get(i));			
		
		}
		 		
		
		return b;
	}
	

}

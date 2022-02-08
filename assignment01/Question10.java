package assignment01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Question10 {
	static String val = ""; 
	
	 public static void main(String[] args) {
	
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of deque :");
		int size=console.nextInt();
		
		Deque<String> d1 = new ArrayDeque<String>();

		for (int i=0;i<size;i++)
		{
			System.out.println("Enter char/string at position"+i+" to Deque");
			d1.add(console.next());
		}
		
		System.out.println("Enter the size of Array");
		int size2=console.nextInt();
		
		int[] ia = new int[size2];
		
		//Providing input for Array
		for (int i=0;i<size2;i++)
		{
			ia[i]=console.nextInt();
		}
		
		for (Integer p : ia) {
			deq(p,d1);
		}

		String res = "";
		
		for (String string : d1) {
			res+=string;
		}
		
		System.out.println("\""+res+"\"");	
		
	}
	
	public static void deq(int p, Deque<String> d1) {
		
		
		if(p == 1) {
			val = d1.poll();
		}else {
			
			if(val!="") {
				d1.addFirst(val);
				val="";
			}
		}
		
	
	}}
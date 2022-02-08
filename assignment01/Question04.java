package assignment01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		 ArrayList<String> listOfString = new ArrayList<String>();

	        String[] w= new String[listOfString.size()];
		 
			System.out.println("Enter the size of arraylist :");
			int count = console.nextInt();
			for(int i=0;i<count;i++) {
				System.out.println("Enter string at position "+i+": ");
				listOfString.add(console.next());
				

			}
			System.out.println(sortt(listOfString));
			

		

	}//main
	
	 public static ArrayList<String> sortt(ArrayList<String> L1) 
		{
	    	Collections.sort(L1, Comparator.comparing(String::length));
	    	return L1;
		}

}

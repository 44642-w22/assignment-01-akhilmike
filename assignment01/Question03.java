package assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		ArrayList<Integer> array=new ArrayList<>();
		
		System.out.println("Enter the size of arraylist :");
		int count = console.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter number at position "+i+": ");
			array.add(console.nextInt());

		}
		
		int max=array.get(0);
		
		for(int i=1;i<count;i++) {
			if(array.get(i)>max) {
				max=array.get(i);
			}
			
		}
		
		System.out.println("Maximum ="+max);
			
	}

}

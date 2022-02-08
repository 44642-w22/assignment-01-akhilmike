package assignment01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Question07 {
	public static void main(String[] args) {
		 
		Scanner console = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		Iterator<Integer> itr = queue.iterator();
		
		System.out.println("Enter Queue Size :");
		int count = console.nextInt();
		int k=count;
		for(int i=0;i<count;i++) {
			System.out.println("Enter number at position "+i+": ");
			queue.add(console.nextInt());

		}
		System.out.println(queue);
		
		double dec=0;
		
		
		  for(int i=0;i<k;i++) {
			dec=dec+(queue.poll()*(Math.pow(2, count-1)));
		
		
            count--;
			
		  }
          System.out.println((int)dec);


	}


}

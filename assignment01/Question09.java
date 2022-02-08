package assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question09 {
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of queue :");
		int size = console.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter number at position "+i+": ");
			queue.add(console.nextInt());
		}
		
		System.out.println(alternative(queue));
		

	}
	
	public static ArrayList<Integer> alternative(Queue<Integer> Q)
	{
		

		ArrayList<Integer> array = new ArrayList<Integer>();
		int size2 = Q.size();
		int size3 = 0;
		
		if (Q.size() % 2 == 0)
			size3 = Q.size() / 2;
		else
			size3 = Q.size() / 2 + 1;


		for (int i=0;i<size3;i++) 
		{ 

		int a = Q.poll();
		int b = -1;

		try {
		b = Q.poll();
		}catch(Exception e) {

		}

		if (a % 2 != 0 && b % 2 == 0) {
			array.add(b);
			if (b != -1)
				array.add(a);
		} else {
			array.add(a);
			if (b != -1)
				array.add(b);
		}

	}
		
		return array;


	}
}

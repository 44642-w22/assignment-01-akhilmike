package assignment01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Question08 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> arrayList=new ArrayList<>();
		Iterator<Integer> itr = queue.iterator();

		System.out.println("Enter the size of Queue :");
		int count= console.nextInt();
		int k=count;
		for(int i=0;i<count;i++) {
			System.out.println("Enter number at position "+i+": ");
			queue.add(console.nextInt());

		}
		for(int i=0 ; i <= queue.size() ; i++) 
		{
			queue = reversequeue(queue);
			arrayList.add(queue.poll());
			queue = reversequeue(queue);
			arrayList.add(queue.poll());
		}
		System.out.println(arrayList);
	}

	public static Queue<Integer> reversequeue(Queue<Integer> queue)
	{
		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty()) {
			stack.add(queue.peek());
			queue.remove();
		}
		while (!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
		return queue;
	}
}

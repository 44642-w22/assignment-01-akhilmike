package assignment01;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		LinkedList<Integer> list1=new LinkedList<>();
		LinkedList<Integer> list2=new LinkedList<>();
		ListIterator<Integer> iterator =list1.listIterator();

		System.out.println("Enter the size of Linkedlist: ");
		int count=console.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter number at position "+i+": ");
			list1.add(i, console.nextInt());

		}
		System.out.println("List1 ="+list1);
		int getEle=0;

		try {
			while(iterator.hasNext()) {


				if(isPerfect(list1.get(getEle))) {

					list2.add(list1.get(getEle));
				}
				getEle++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	

		System.out.println("List2 ="+list2);

	}

	public static boolean isPerfect(int num) {
		long s=0;
		int j=1;
		while(j<=num/2)
		{
			if(num%j==0)
			{
				s+=j;
			}
			j++;
		}
		if(s==num)
		{
			return true;
		}
		else
			return false;
	}

}

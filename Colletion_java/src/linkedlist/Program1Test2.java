package linkedlist;

import java.util.LinkedList;

public class Program1Test2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(5);
		ll.add(7);
		ll.add(2);
		ll.add(9);
		ll.add(0);
		ll.add(3);
		ll.add(8);
		ll.add(6);
		
		
		
		int odd=Program1.minimumOdd(ll);
		int even=Program1.maxEven(ll);
		System.out.println("minimun odd number :"+odd);
		System.out.println("maximum even number :"+even);
		System.out.println("sum of minimum odd and max even "+(odd+even));
		

	}

}

package linkedlist;

import java.util.LinkedList;

public class Linked1 {
	
	public static boolean isPrime(int n) {
		int c=0;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		
		if(c==0 ) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<>();
		long start=System.nanoTime();
		for(int i=0;i<10;i++) {
			if(isPrime(i)) 
				ll.add(i);
		}
		long end=System.nanoTime();
		System.out.println(end-start);
		System.out.println(ll);
	}

}

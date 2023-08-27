package arraylisst;

import java.util.ArrayList;
import java.util.LinkedList;

public class Efficiecy {

	public static void main(String[] args) {

		
		
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i=1;i<1000;i++) {
			ll.add(i);
		}
		long start1=System.nanoTime();
		ll.add(199,29);
		long end1=System.nanoTime();
		System.out.println(ll);
		System.out.println(" ll time "+(end1-start1));
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<1000;i++) {
			al.add(i);
		}
		long start=System.nanoTime();
		al.add(199,29);
		long end=System.nanoTime();
		System.out.println("al time "+(end-start));
		
	}

}

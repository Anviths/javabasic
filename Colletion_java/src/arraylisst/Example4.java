package arraylisst;

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(50);
		al.add(5);
		al.add(10);
		
		System.out.println("arraylist :"+al);
//		System.out.println(al.get(2));
//		Collections.sort(al);
//		System.out.println("sorted arraylist :"+ al);
//		Collections.reverse(al);
//		System.out.println("reversed arraylist :"+al);

		Collections.sort(al);
		System.out.println(al);
		int a=Collections.binarySearch(al, 40);
//		System.out.println(al.get(a));
		System.out.println(a);
	}

}

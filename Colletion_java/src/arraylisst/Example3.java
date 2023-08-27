package arraylisst;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(43);
		al.add(20);
		al.add(17);
		al.add(14);
		al.add(37);
		System.out.println("before sorting: "+al);
		Collections.sort(al,new Dse());
		System.out.println("after sorting : "+al);
	
	}

}

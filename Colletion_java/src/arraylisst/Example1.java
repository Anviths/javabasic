package arraylisst;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a= new ArrayList();
		a.add(10); //new Integer(10);
		a.add(new Integer(20));
		a.add(Integer.valueOf(10));
		a.add(35);
		System.out.println(a);
		ArrayList a1= new ArrayList<>();
		a1.add(10); //new Integer(10);
		a1.add(20);
		a1.add(Integer.valueOf(45));
		a1.add(15);
		
		a.addAll(a1);
		System.out.println(a);
	}

}

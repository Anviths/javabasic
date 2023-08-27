package arraylisst;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList bag=new ArrayList();
		bag.add("kannada");
		bag.add("english");
		bag.add("Science");
		bag.add("social");
		bag.add("maths");
		bag.add(1);
		System.out.println(bag);
		
		ArrayList bag2=new ArrayList();
		bag2.add("html");
		bag2.add("spring");
		bag2.add("react");
		bag2.add("python");
		bag2.add("java");
		Collections.sort(bag2);
		System.out.println(bag2);
		
		bag.addAll(bag2);
		System.out.println(bag);
		
		bag.remove((Integer)1);
		System.out.println(bag);
		
		bag.removeAll(bag2);
		System.out.println(bag);
		
		bag.add(2, "science");
		System.out.println(bag);
		
		bag.clear();
		System.out.println(bag);
	}

}

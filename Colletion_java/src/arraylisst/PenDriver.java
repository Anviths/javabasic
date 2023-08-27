package arraylisst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class PenDriver {
	public static void main(String[] args) {
		
	ArrayList<Pen> p = new ArrayList<>();
	Pen p1=new Pen(10, "black");
	
	p.add(p1);
	p.add(new Pen(50, "black"));
	p.add(new Pen(30, "blue"));
	p.add(new Pen(40, "red")); 
	p.add(new Pen(10, "pink"));
	p.add(new Pen(15, "black"));
	p.add(new Pen(20, "yellow"));
	p.add(new Pen(35, "yellow"));
	
	System.out.println("pen before sorting"+p);
	Collections.sort(p );
	System.out.println("***********************");
	System.out.println("pen after sorting"+p);
	Collections.shuffle(p);
	System.out.println("collection after shuffel: "+p);
//	Collections.reverse(p);
//	Collections.sort(p, Collections.reverseOrder());
	System.out.println(p);
//	System.out.println("================================");
//	System.out.println("pen after sorting"+p);
//	System.out.println(p);
	
//	for(Pen pr:p) {
//		Pen pen=(Pen)pr;
//		if(pen.price<=30) {
//			System.out.println(pr);
//		}
//		
//	}
	System.out.println("============================");
//	Iterator i=p.iterator();
//	while(i.hasNext()) {
//		Pen pen=(Pen) i.next();
//		if(pen.price<=30) {
//			
//		}
//		
//	}
//	for (Pen pen : p) {
//		
//		System.out.println(pen.price);
//	}
//	
//	ListIterator i=p.listIterator();
//	
//	while(i.hasNext()) {
//		System.out.println(i.next());
//		System.out.println(i.nextIndex());
//	}
//	System.out.println("=======================");
//	while(i.hasPrevious()) {
//		System.out.println(i.previous());
//		System.out.println(i.previousIndex());
//		
//	}
	
	
	}
	

}

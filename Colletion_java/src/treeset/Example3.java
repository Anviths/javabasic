package treeset;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Integer> t=new TreeSet<>(new com());
		t.add(10);
		t.add(12);
		t.add(1);
		t.add(55);
		t.add(15);
		t.add(25);
		t.add(6);
		t.add(39);
		t.add(19);
		t.add(24);
		System.out.println(t);
		
		TreeSet<Integer> t1=new TreeSet<>(t.comparator());
		t1.add(1);
		t1.add(18);
		t1.add(14);
		t1.add(72);
		t1.add(25);
		t1.add(69);
		t1.add(95);
		t1.add(189);
		t1.add(23);
		System.out.println(t1);
		
		SortedSet<Integer> nav=t1.subSet(100, 15);
		System.out.println(nav);
		SortedSet<Integer> nav1=t1.headSet(30);
		System.out.println(nav1);
		System.out.println(t1.tailSet(100));
		
		NavigableSet<Integer> navg=t1.subSet(70, true, 14, false);
		System.out.println(navg);
		
		TreeSet<Integer> t2=new TreeSet<>(nav);
		System.out.println(t2);
	}

}
class com implements  Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}

package treeset;

import java.util.TreeSet;

public class PenDriver {

	public static void main(String[] args) {

		TreeSet<Pen> t=new TreeSet<>();
		t.add(new Pen(10,"blue"));
		t.add(new Pen(10,"blue"));
		t.add(new Pen(30,"black"));
		t.add(new Pen(10,"black"));
		t.add(new Pen(30,"blue"));
		t.add(new Pen(30,"blue"));
		System.out.println(t.size());
		
		System.out.println(t);
	}

}

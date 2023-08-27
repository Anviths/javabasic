package treeset;

import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {

		TreeSet<Pen> t=new TreeSet<>();
		// only homogeneous
		//null not allowed
		t.add(new Pen(10,"blue"));
		t.add(new Pen(10,"blue"));
		t.add(new Pen(20,"black"));
		t.add(new Pen(10,"yellow"));
		t.add(new Pen(20,"pink"));
		t.add(new Pen(30,"green"));
		t.add(new Pen(30,"green"));
		
		System.out.println(t.size());
		System.out.println(t);
	}

}

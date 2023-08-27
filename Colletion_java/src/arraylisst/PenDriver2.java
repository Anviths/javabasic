package arraylisst;

import java.util.ArrayList;

public class PenDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pen> p = new ArrayList<Pen>();
		Pen p1=new Pen(10, "black");
		
		p.add(p1);
		p.add(new Pen(50, "black"));
		p.add(new Pen(30, "blue"));
		p.add(new Pen(40, "red"));
		p.add(new Pen(10, "pink"));
		p.add(new Pen(15, "red"));
		p.add(new Pen(20, "yellow"));
		p.add(new Pen(35, "yellow"));
		
		int sum=0;
		for(Pen obj:p) {
			sum+=obj.price;
		}
		System.out.println(sum);

	}

	
}

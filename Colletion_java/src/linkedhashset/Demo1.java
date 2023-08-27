package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

import edu.ty.iteam.model.Item;

public class Demo1 {

	public static void main(String[] args) {

		LinkedHashSet l=new LinkedHashSet<>();
		l.add(15);
		l.add(20);
		l.add(new Item(1,"eijf",250));
		l.add("java");
		l.add('c');
		l.add(new Item(1,"eijf",250));
		l.add(95+65);
		l.add(45+15+'a'+2);
		l.add(new Item(2,"xyz",100));
		
		
//		Iterator i=l.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		for(Object obj:l) {
			System.out.println(obj);
		}
	}

}

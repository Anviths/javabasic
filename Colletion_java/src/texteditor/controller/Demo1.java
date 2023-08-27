package texteditor.controller;

import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>();
		System.out.println(v.capacity());		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		
//		Enumeration<Integer> e=v.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		System.out.println(v);
		v.add(2,25);
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
	
		System.out.println(v.capacity());
		Object a=v.clone();
		System.out.println(a);
	}
}

package edu.ty.hashmap;

import java.util.HashMap;

public class Example1 {

	public static void main(String[] args) {

		HashMap map=new HashMap<>();
		map.put(10, "hello");
		map.put(true, "yes");
		map.put(false, "no");
		map.put("hello", 25);
		map.put(null, null);
		map.put(1, null);
		map.put(2, null);
		map.put(10, "java");
		
		System.out.println(map.get(null));//find the value based on the key if
		System.out.println(map.getOrDefault(11, "no value"));
//		System.out.println(map);
		
//		Set entry=map.entrySet();
//		Iterator ent=entry.iterator();
//		System.out.println("-----------entry----------");
//		while(ent.hasNext()) {
//			System.out.println(ent.next());
//		}
//		
//		Collection col=map.values();
//		Iterator i=col.iterator();
//		System.out.println("------------value---------------");
//		while(i.hasNext()) System.out.println(i.next());
//		
//		Set keys=map.keySet();
//		Iterator key=keys.iterator();
//		System.out.println("---------keys------------------");
//		while (key.hasNext()) {
//			System.out.println( key.next());
//			
//		}
	}

}

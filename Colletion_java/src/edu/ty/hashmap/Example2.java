package edu.ty.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		HashMap<Character,Integer> map=new HashMap<>();
		System.out.println("enter the character");
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();
		int n=1;
		
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.containsKey(str.charAt(n))?n+1:n);
		}

		System.out.println(map);
	}
	

}

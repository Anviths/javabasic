package texteditor.controller;

import java.util.Stack;

public class Demo2 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(10);
		s.push(20);
		System.out.println(s);
		System.out.println(s.peek());
		s.push(30);
        s.push(22);
        s.push(44);
        s.push(10);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
	}
}

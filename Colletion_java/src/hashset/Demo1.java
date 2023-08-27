package hashset;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add("a");
		h.add('c');
		h.add("ajdas");
		h.add(null);
		h.add(10 + 25 + 'a' + 'b');
		h.add(65);
		h.add(1);
		h.add(null);
		h.add('A');
		h.add(true);

		System.out.println(h);
		h.remove(null);
		System.out.println(h);
		System.out.println();

	}

}

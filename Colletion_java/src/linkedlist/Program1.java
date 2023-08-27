package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Program1 {
	public static int minimumOdd(LinkedList<Integer> ll) {
		Collections.sort(ll);
		int odd = 0;
		for (int ele : ll) {
			if (ele % 2 != 0) {
				odd = ele;
				break;
			}
		}
		return odd;
	}

	public static int maxEven(LinkedList<Integer> ll) {
		Collections.sort(ll, Collections.reverseOrder());

		int even = 0;
		for (int ele : ll) {
			if (ele % 2 == 0) {
				even = ele;
				break;
			}
		}
		return even;
	}

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(0);
		ll.add(2);
		ll.add(7);
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(8);
		ll.add(5);

		int odd = minimumOdd(ll);
		int even = maxEven(ll);
		System.out.println("minimun odd number :" + odd);
		System.out.println("maximum even number :" + even);
		System.out.println("sum of minimum odd and max even " + (odd + even));

	}

}

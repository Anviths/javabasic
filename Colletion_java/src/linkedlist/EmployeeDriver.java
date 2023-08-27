package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeDriver {

	public static int averagesalary(LinkedList<Employee> emp, String deparetment) {
		
		int sum=0,c=0;
		for(Employee e:emp) {
			if(e.department.equals(deparetment)) {
				sum+=e.salary;
				c++;
			}
		}
		if(c!=0)
		return sum/c;
		
		return 0;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		LinkedList<Employee> ll=new LinkedList<Employee>();
		
		Employee e1=new Employee("ram", "dev", 10000);
		Employee e2 = new Employee("jhon", "test", 30000);
		Employee e3= new Employee("miller", "dev", 15000);
		Employee e4=new Employee("smith", "test", 20000);
		
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
		System.out.println("enter the depaetment name");
		int avg=averagesalary(ll, scan.next());
		System.out.println(avg);
	}
}

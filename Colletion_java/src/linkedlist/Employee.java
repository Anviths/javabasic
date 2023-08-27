package linkedlist;

public class Employee {

	String name;
	String department;
	double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}

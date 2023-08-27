package video3;

public class Employee {

	String name;
	int id;
	long phone;

	Employee(String name,int id,long phone){
		this.name=name;
		this.id=id;
		this.phone=phone;
	}
	public static Employee createEmployee(String name,int id,long phone) {
		return new Employee(name, id, phone);
	}
}

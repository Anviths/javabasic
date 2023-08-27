package video3;

public class EmployeeTest {
	
	public static void displayEmployee(Employee e) {
		System.out.println("Name :"+e.name);
		System.out.println("id :"+e.id);
		System.out.println("phone number "+e.phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=Employee.createEmployee("pavan", 1254, 8254154157l);
		Employee e2=Employee.createEmployee("Rohiht", 1274, 8254784157l);
		
		displayEmployee(e2);
		System.out.println("==================");
		displayEmployee(e1);

	}

}

package purposeofsupercall;

public class Student extends Person{
	int id;
	public Student() {
		// TODO Auto-generated constructor stub
	}

	Student(int id,String name){
		super(name); //data inside  variable name
		               // is passed from child to parent class
		this.id=id;  
	}

}

package video2;

public class Student {
//attribute of student
	private String name;
	

	// getter name
	public  String getName( ) {
		return name;
	}
	//setter name
	public  void setName(String name ) {
		this.name=name;
	}
	//attribute class
	private int clas;
	
	//getter class
	public  int getclas( ) {
		return clas;
	}
	//setter class
	public  void setclas(int clas ) {
		this.clas=clas;
	}
	//atributes marks of int[] 
	private int[] marks;
	//getter 
	public  int[] getMarks( ) {
		return marks;
	}
	//setter
	public  void setMarks(int[] marks ) {
		this.marks=marks;
	}

//constructor
	public Student(String name,int clas,int[] marks) {
		// TODO Auto-generated constructor stub
		setName(name);
		setclas(clas);
		setMarks(marks);
	}

	public void displayMarks() {
		System.out.println("marks of stusent "+name +" is stusding in class " +clas + " marks "+marks);
	}
}

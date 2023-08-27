package equalsmethodexample;

class Person {

	String name ;
	int age;



	Person (String name , int age ){
		this.name = name ;
		this.age = age ;
	}
}

class Doctor extends Person{
	int dlno;


	public Doctor(String name, int age, int dlno) {
		super(name, age);
		this.dlno = dlno;
	}



}

class Cardiologist extends Doctor{
	int id;


	public Cardiologist(String name, int age, int dlno, int id) {
		super(name, age, dlno);
		this.id = id;
	}

}

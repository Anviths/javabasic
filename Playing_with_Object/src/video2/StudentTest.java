package video2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {90,85,75,80,87};

		Student s1=new Student("sheela",5,a);
		System.out.println(Students.total(s1));
		System.out.println(Students.average(s1));

	}

}

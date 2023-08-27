package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Student> students=new HashSet<>(10);
       
       students.add(new Student(10, "raju"));
       students.add(new Student(10, "raju"));
       students.add(new Student(21, "ramu"));
       students.add(new Student(33, "sharath"));
       students.add(new Student(42, "divya"));
       students.add(new Student(40, "divya"));
       students.add(new Student(54, "suman"));
       students.add(new Student(10, "priya"));
       students.forEach();
       
       for (Student student : students) {
		int index=student.hashCode()%10;
		System.out.println("index :"+index+","+student);
	}
       
	}

}

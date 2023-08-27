package hashset;

import java.util.Objects;

public class Student {


	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	Integer sid;
	String name;
	@Override
	public String toString() {
		return "{"+sid + "," + name+"}" ;
	}
	@Override
	public int hashCode() {
		return sid.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
	Student s=(Student)obj;
	return s.sid==(sid);
	}
	
	
	
//	

}

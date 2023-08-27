package treeset;

import java.util.Comparator;

public class Contact {

	String name;
	long phoneNumber;
	
	public Contact(String name, long phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name + " : " + phoneNumber +"\n";
	}
	
}

class SortContactByNameAsending implements Comparator<Contact>{

	@Override
	public int compare(Contact o1, Contact o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
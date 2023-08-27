package purposeofsupercall;

public class Father {
  static int is=23;
	String name="James";
}

class Son extends Father{
	String name="Smith";
	static int is=45;
	void sonData() {
		System.out.println("Father Name " + super.name);
		System.out.println("Son Name " + this .name);
		System.out.println("Father id " + super .is);
		System.out.println("Son is " + this .is);
		
	}
}

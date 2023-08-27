package inhertance1;
class BaseClass{
	int x=20;
}

class DerivedClass extends BaseClass{
	int y=20;
}

public class Example4 {

	public static void main(String[] args) {
//		BaseClass b=new BaseClass();
//		System.out.println(b.y);
//		System.out.println(b.x);
		
		DerivedClass b=new DerivedClass();
		System.out.println(b.y);
		System.out.println(b.x);
		
	}
}

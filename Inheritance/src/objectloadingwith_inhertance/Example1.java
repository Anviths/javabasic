package objectloadingwith_inhertance;

class Parent{
	int i;
	Parent(){
		super();
		System.out.println("From parent");
	}
}

class Child extends Parent{
	int j;
	
	Child(){
		super();
		System.out.println("from Child");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child3 c=new Child3();
	}

}

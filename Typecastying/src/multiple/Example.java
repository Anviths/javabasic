package multiple;

interface Call{
	
}
class Text{
	
}
class Phone extends Text implements Call {
	
}
public class Example {

	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println(p);
		Call c=p;
		Text t=p;
		System.out.println(c);
		System.out.println(t);
		Text t1=new Text();
		System.out.println(t1);
		Call c1=(Call) t1;
		System.out.println(c1);

	}
	
}

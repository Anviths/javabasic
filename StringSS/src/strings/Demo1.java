package strings;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello";
		String s2="hi";
		String s3= s2;
		s1=s3;
		System.out.println(s1=="hi");

		String x1= new String("hello");

		System.out.println( s2=="hi");
		System.out.println( x1=="hi");
		System.out.println( x1.equals("hello"));
	}

}

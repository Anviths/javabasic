package treeset;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		String rex="[0-9]{10}";
		Pattern pattern=Pattern.compile(rex);
		String inp="12345j7890";
		Matcher matcher=pattern.matcher(inp);
		System.out.println(matcher.matches());
		
	}
}

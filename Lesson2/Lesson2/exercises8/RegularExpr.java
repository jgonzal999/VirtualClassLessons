package exercises8;

import java.util.regex.*;

public class RegularExpr {

	public static void main(String[] args) {
		String pattern = "[a-z]+";
		//String pattern = "e";
		String check = "Regular Expressions";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		//System.out.println( c.find() );
		//System.out.println( c.start()+" "+c.end() );
		
		while (c.find())
			
	      	System.out.println( check.substring( c.start(), c.end() ) );


	}

}

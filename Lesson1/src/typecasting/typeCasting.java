package typecasting;

public class typeCasting {

	public static void main(String[] args) {
		// Implicit conversion
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println(" Value of a(char): "+a);
		int b=a;
		System.out.println("  If int b=a, value of b: "+b);
		float c=a;
		System.out.println("  If float c=a, value of c: "+c);		
		long d=a;
		System.out.println("  If long d=a, value of d: "+d);		
		double e=a;
		System.out.println("  If double e=a, value of e: "+e+"\n");	
		System.out.println("Explicit Type Casting");
		//explicit conversion		
		double x=45.5;
		//int z=x; //It doesn't work the implicit casting at that example due type of the variables, we need explicit casting
		int y=(int)x;
		System.out.println(" Value of x(double): "+x);
		System.out.println("  If int y=(int)x, value of y: "+y);	

	}

}

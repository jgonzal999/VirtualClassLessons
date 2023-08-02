package exercises1;

public class OverloadMethod {
	public void area(int b,int h) {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }


	public static void main(String[] args) {
		OverloadMethod obj = new OverloadMethod();
	       obj.area(8,12);
	       obj.area(4);  


	}

}

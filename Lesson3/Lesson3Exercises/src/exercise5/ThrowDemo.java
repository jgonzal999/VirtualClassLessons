package exercise5;

public class ThrowDemo {

	public static void main(String[] args) {
		int a=45,b=0,rs;

        try{
            if(b==0) throw(new ArithmeticException("Can't divide by zero."));
            else{
                rs = a / b;
                System.out.print("\n The result is : " + rs);
            }
        } catch(ArithmeticException Ex){
            System.out.print("\n Error : " + Ex.getMessage());
        }

        System.out.print("\n End of program.");


	}

}

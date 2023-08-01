package accessmodifiers.pack1;

class PrivateAccessSpecifier { 
   private void display() { //private
        System.out.println(" You are using private access specifier: private void display() "); 
    } 
} 


public class AccessSpecifiers2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PrivateAccessSpecifier  pri = new PrivateAccessSpecifier(); 
	    //pri.display(); // display() it can only use at its class
		System.out.println(" You cannot use private access method if it is defined in another class: private void display() "); 
	}
}

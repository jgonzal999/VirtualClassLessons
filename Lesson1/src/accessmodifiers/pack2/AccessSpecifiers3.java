package accessmodifiers.pack2;

import accessmodifiers.pack1.ProtectedAccessSpecifier;

public class AccessSpecifiers3 extends ProtectedAccessSpecifier {

	public static void main(String[] args) {
		System.out.println("Protected Access Specifier");
		AccessSpecifiers3 pro = new AccessSpecifiers3 ();   
	    pro.display(); //We can access this protected method because this class extends the one in that display() is defined 
	}
}

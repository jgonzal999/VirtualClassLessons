package accessmodifiers.pack1;

class DefaultAccessSpecifier{
	void display() { //default
        System.out.println(" You are using default access specifier: void display()"); 
    } 
}

public class AccessSpecifiers1 {

	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		DefaultAccessSpecifier def = new DefaultAccessSpecifier(); 		  
        def.display(); //we can use display at the classes under the same package
        
	}
}

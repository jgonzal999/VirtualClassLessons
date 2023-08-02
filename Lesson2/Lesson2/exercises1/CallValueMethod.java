package exercises1;

public class CallValueMethod {
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		CallValueMethod d = new CallValueMethod();
		System.out.println("Before operation value of val data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of val data is "+d.val);//Is the same because value of value doesn't change
		System.out.println("After operation value of operation return data is "+d.operation(100));
		}


}

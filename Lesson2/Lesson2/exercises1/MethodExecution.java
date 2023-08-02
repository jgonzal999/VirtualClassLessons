package exercises1;

public class MethodExecution {
	public int multnumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {
		MethodExecution b=new MethodExecution();
		int ans= b.multnumbers(10,3);
		System.out.println("Multiplication "+10+"*"+3+": "+ans);


	}

}

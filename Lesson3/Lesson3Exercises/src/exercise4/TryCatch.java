package exercise4;

public class TryCatch {

	public static void main(String[] args) {
		int[] array = new int[3];
        try {
            array[7] = 3;
            System.out.println("Array index is OK!"); 
        }catch (Exception e) {
            System.out.println("Array index is out of bounds!"); 
        } finally  {
            System.out.println("The array size is: " + array.length);
        }
        System.out.println("That's all!");


	}

}

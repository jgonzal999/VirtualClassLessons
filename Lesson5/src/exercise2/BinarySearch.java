package exercise2;

public class BinarySearch {
	
	public static void binarysearch(int[] arr, int start, int end, int value) {
		int middle=(start+end)/2;
		while (start<=end) {
			if (arr[middle]<value) {
				start=middle+1;
			}else if(arr[middle]==value) {
				System.out.println("Element "+value+" is founded at index: "+middle);
				break;
			}else {
				end=middle-1;
			}
			middle=(start+end)/2;
		}
		if (start>end) System.out.println("Element "+value+" is not found");
	}

	public static void main(String[] args) {
		int[] arr= {3,6,9,12,15,16,20,31};
		int value=20;
		int end=arr.length;
		int start=0;
		binarysearch(arr, start, end, value);

	}

}

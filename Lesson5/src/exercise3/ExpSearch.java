package exercise3;

import java.util.Arrays;

public class ExpSearch {
	public static int expSearch(int[]arr, int length, int value) {
		if (arr[0]==value) return 0;
		int i=1;
		while(i<length && arr[i]<=value) {
			i=i*2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);	// arr must be sorted	
		//binarySearch(int[] a, int fromIndex, int toIndex, int key)
	}

	public static void main(String[] args) {
		int[] arr= {3,6,9,12,15,16,20,31};
		int value=16;
		int length=arr.length;
		int result=expSearch(arr, length, value);
		if(result<0) {
			System.out.println("Element is not present in the array: "+Arrays.toString(arr));
		}else {
			System.out.println("Element: "+value+" is at the index: "+result+" of the array: "+Arrays.toString(arr));
		}

	}

}

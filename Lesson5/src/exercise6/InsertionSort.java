package exercise6;

import java.util.Arrays;

public class InsertionSort {
	static int size=30;
	static int value=15;
	
	public static int[] createnumbers(){
		int rannumbers[] = new int[size];
		for (int i=0;i<size;i++) {
			rannumbers[i]=(int)(Math.random()*value);
		}
		return rannumbers;
	}
	
	public static void insertionSort(int[] arr) {
		
		int len =arr.length;
		int key=0;
		for (int j=1;j<len;j++) {
			 key=arr[j];
			 int i = j-1;
			 while ((i>-1) && arr[i]>key) {
				 arr[i+1]=arr[i];
				 i--;
			 }
			 arr[i+1]=key;
		}
	}

	public static void main(String[] args) {
		int[] randomlist =createnumbers();
		System.out.println("Random List Elements: "+Arrays.toString(randomlist));
		insertionSort(randomlist);
		System.out.println("Sorted List Elements: "+Arrays.toString(randomlist));

	}

}

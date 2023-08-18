package exercise5;

import java.util.Arrays;

public class BubleSort {
	static int size=30;
	static int value=15;
	
	public static int[] createnumbers(){
		int rannumbers[] = new int[size];
		for (int i=0;i<size;i++) {
			rannumbers[i]=(int)(Math.random()*value);
		}
		return rannumbers;
	}
	public static void bubleSort(int[] arr) {
		 int len =arr.length;
		 int temp=0;
		 for (int i=0;i<len;i++) {
			 for (int j=1;j<len;j++) {
				 if (arr[j-1]>arr[j]) {
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
	}

	public static void main(String[] args) {
		int[] randomlist =createnumbers();
		System.out.println("Random List Elements: "+Arrays.toString(randomlist));
		bubleSort(randomlist);
		System.out.println("Sorted List Elements: "+Arrays.toString(randomlist));

	}

}

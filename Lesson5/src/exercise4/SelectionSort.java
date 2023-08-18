package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	static int size=30;
	static int value=15;
	
	public static int[] createnumbers(){
		int rannumbers[] = new int[size];
		for (int i=0;i<size;i++) {
			rannumbers[i]=(int)(Math.random()*value);
		}
		return rannumbers;
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int index =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
				index=j;
				}
			}
			int small=arr[index];
			arr[index]=arr[i];
			arr[i]=small;
		}
	}

	public static void main(String[] args) {
		int[] randomlist =createnumbers();
		System.out.println("Random List Elements: "+Arrays.toString(randomlist));
		selectionSort(randomlist);
		System.out.println("Sorted List Elements: "+Arrays.toString(randomlist));
	}

}

package exercise8;

import java.util.Arrays;

public class QuickSort {
	static int size=30;
	static int value=15;
	
	public static int[] createnumbers(){
		int rannumbers[] = new int[size];
		for (int i=0;i<size;i++) {
			rannumbers[i]=(int)(Math.random()*value);
		}
		return rannumbers;
	}
	
	int partition(int arr[],int low, int high) {
		int pivot =arr[high];
		int i=low-1;
		for (int j=low;j<high;j++) {
			if (arr[j]<=pivot) {
				i++;
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
						
			}
		}
		int temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
	
	void sort(int arr[],int low,int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}

	public static void main(String[] args) {
		int[] randomlist =createnumbers();
		System.out.println("Random List Elements: "+Arrays.toString(randomlist));
		QuickSort obj = new QuickSort();
		obj.sort(randomlist,0,randomlist.length-1);
		System.out.println("Sorted List Elements: "+Arrays.toString(randomlist));
	}

}

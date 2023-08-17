package exercise1;

import java.util.Scanner;

public class LinearSearch {
	public static int linearFind (int arr[], int x) {
		for (int i=0;i<arr.length-1;i++) {
			if(arr[i]==x)return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {10,20,30,40,50,60,70,8,5,4,3,};
		System.out.println("Enter a value to be searched: ");
		int value = sc.nextInt();
		int result = linearFind(arr,value);
		if (result==-1) {
			System.out.println("Element "+value+" is not in the array");
		}else {
			System.out.println("Element "+value+" is on position "+result+" of the array and the search key is "+arr[result]);
		}

	}

}

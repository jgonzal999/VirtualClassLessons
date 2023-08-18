package exercise7;

import java.util.Arrays;

public class MergeSort {
	static int size=30;
	static int value=15;
	
	public static int[] createnumbers(){
		int rannumbers[] = new int[size];
		for (int i=0;i<size;i++) {
			rannumbers[i]=(int)(Math.random()*value);
		}
		return rannumbers;
	}
	
	void merge(int[] arr,int l,int m, int r) {
		System.out.println("Merge: "+l+" "+m+" "+r);
		int n1=m-l+1;
		int n2 = r-m;
		int lArray[]=new int[n1];
		int rArray[]=new int[n2];
		for(int i=0;i<n1;++i)
			lArray[i]=arr[l+i];
		for(int j=0;j<n2;++j)
			rArray[j]=arr[m+1+j];
		int i=0,j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if (lArray[i]<=rArray[j]) {
				arr[k]=lArray[i];
				i++;
			}else {
				arr[k]=rArray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=lArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rArray[j];
			j++;
			k++;
		}
			
	}
	
	void sort(int[] arr,int l, int r) {
		if (l<r) {
			System.out.println("Sort: "+l+" "+r);
			int m=(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);			
		}
	}

	public static void main(String[] args) {
		int[] randomlist =createnumbers();
		System.out.println("Random List Elements: "+Arrays.toString(randomlist));
		MergeSort obj =new MergeSort();
		obj.sort(randomlist,0,randomlist.length);
		System.out.println("Sorted List Elements: "+Arrays.toString(randomlist));

	}

}

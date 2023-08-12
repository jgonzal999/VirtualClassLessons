package increasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class LongestIncreasingSubs {
	static int size;
	int[] createnumbers(){
		int rannumbers[] = new int[size];
		for (int i=0;i<size;i++)
			rannumbers[i]=(int)(Math.random()*10);
		return rannumbers;
	}
	ArrayList findlongest(int[] randoml) {
		ArrayList longest = new ArrayList();
		Stack longer = new Stack();
		for (int x : randoml) {
			System.out.println(x);
			try {
				if ((int)longer.peek()<x) {
					longer.push(x);
				}else{
					if (longest.size()<longer.size()) {
						for (int i=0;i< longer.size();i++) {
						longest.add(longer.size()-1-i,longer.pop());
						}
					}
					longer=null;
				}
			}catch(EmptyStackException e) {
				longer.push(x);
			}
		}			
		return longest;
	}
	

	public static void main(String[] args) {
		LongestIncreasingSubs lis = new LongestIncreasingSubs();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please insert the length of the random list of numbers: ");
		lis.size=sc.nextInt();		
		int[] randomlist =lis.createnumbers();
		System.out.println("Random list of numbers: "+ Arrays.toString(randomlist));
		ArrayList longest = lis.findlongest(randomlist);
		System.out.println("Longest increasing subsequence: "+ longest);
		

	}

}

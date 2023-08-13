package increasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class LongestIncreasingSubs {
	static int size;
	static int value;
	int[] createnumbers(){
		int rannumbers[] = new int[size];
		for (int i=0;i<size;i++)
			rannumbers[i]=(int)(Math.random()*value);
		return rannumbers;
	}
	ArrayList findlongest(int[] randoml) {
		ArrayList longest = new ArrayList();
		Stack longer = new Stack();
		for (int x : randoml) {
			try {
				if ((int)longer.peek()<x) {
					longer.push(x);
				}else{
					if (longest.size()<longer.size()) {
						longest.clear();
						int longersize = longer.size();
						for (int i=0;i< longersize;i++) {
							longest.add(longer.pop());
						}
						Collections.reverse(longest);
					}
					longer.clear();
					longer.push(x);
				}
			}catch(EmptyStackException e) {
				longer.push(x);
			}
		}			
		return longest;
	}
	

	public static void main(String[] args) {
		Menus menu = new Menus();
		int op;
		char ex ='n';
		LongestIncreasingSubs lis = new LongestIncreasingSubs();
		Scanner sc= new Scanner(System.in);
		menu.welcome();	
		do {
			do {
				menu.mainMenu();
				op = sc.nextInt();
			}while (op<1 || op>2);
			if (op==1) {
				switch(op) {
					case 1:
						menu.insertSize();
						lis.size=sc.nextInt();	
						menu.insertNumberValues();
						lis.value=sc.nextInt();
						int[] randomlist =lis.createnumbers();
						System.out.println("- Random list of numbers: "+ Arrays.toString(randomlist));
						ArrayList longest = lis.findlongest(randomlist);
						System.out.println("- Longest increasing subsequence: "+ longest);
						break;

				}
				
			}else {
				menu.cont();
				ex = sc.next().charAt(0);
				if (ex!='y' && ex!='Y') {
					op=0;
				}
			}
		}while(op!=2);
		menu.bye();
	}

}

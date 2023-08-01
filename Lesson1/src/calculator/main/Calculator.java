package calculator.main;

import java.util.Scanner;
import calculator.menu.*;
import calculator.operations.*;


public class Calculator {

	public static void main(String[] args) {
		Menus menu = new Menus();
		Operations oper = new Operations();
		Scanner sc = new Scanner(System.in);
		int op;
		char ex ='n';
		double a;
		double b;
		double res;
		//main
		menu.welcome();		
		do {
			do {
				menu.mainmenu();
				op = sc.nextInt();
			}while (op<1 || op>5);
			if (op>0 && op<5) {
				menu.insertnumber('a');
				a = sc.nextDouble();
				menu.insertnumber('b');
				b = sc.nextDouble();				
				switch(op) {
					case 1:
						res=oper.add(a, b);
						menu.result("a+b", res);
						break;
					case 2:
						res=oper.sub(a, b);
						menu.result("a-b", res);
						break;
					case 3:
						res=oper.mult(a, b);
						menu.result("a*b", res);
						break;
					case 4:
						res=oper.div(a, b);
						menu.result("a/b", res);
						break;						
				}
				
			}else {
				menu.cont();
				ex = sc.next().charAt(0);
				if (ex!='y' && ex!='Y') {
					op=0;
				}
			}
			
		}while(op!=5);
		menu.bye();

	}

}

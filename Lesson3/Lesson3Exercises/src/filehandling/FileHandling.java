package filehandling;

import java.util.Scanner;
import filehandling.*;

public class FileHandling {

	public static void main(String[] args) {
		Menus menu = new Menus();
		Operations oper = new Operations();
		Scanner sc = new Scanner(System.in);
		int op;
		char ex ='n';
		String a;
		String b;
		//main
		menu.welcome();		
		do {
			do {
				menu.mainMenu(oper.defdirectory);
				op = sc.nextInt();
			}while (op<1 || op>6);
			if (op>0 && op<6) {
				switch(op) {
					case 1:
						menu.insertDirectory();
						a = sc.next();
						try {
							oper.workDirectory(a);
						}catch(Exception e) {
							menu.sorry();
						}
						
						break;
					case 2:
						menu.insertNew();
						a = sc.next();
						try {
							oper.addNewFile(a);
						}catch(Exception e) {
							menu.sorry();
						}
						
						break;
					case 3:
						menu.insertDel();
						a = sc.next();
						try {
							oper.delFile(a);
						}catch(Exception e) {
							menu.sorry();
						}
						break;
					case 4:
						menu.insertDirectory();
						a = sc.next();
						try {
							oper.listFiles(a);
						}catch(Exception e) {
							menu.sorry();
						}
						break;
					case 5:
						menu.insertDirectory();
						a = sc.next();
						menu.insertFile();
						b=sc.next();
						try {
							oper.writeFile(a,b);
						}catch(Exception e) {
							menu.sorry();
						}
						break;
				}
						
			}else {
				menu.cont();
				ex = sc.next().charAt(0);
				if (ex!='y' && ex!='Y') {
					op=0;
				}
			}
		}while(op!=6);
		menu.bye();

	}

}

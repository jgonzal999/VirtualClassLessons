package filehandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import filehandling.*;

public class FileHandling {

	public static void main(String[] args) {
		Menus menu = new Menus();
		Operations oper = new Operations();
		Scanner sc = new Scanner(System.in);
		int op=0;
		char ex ='n';
		String a;
		String b;
		//main
		menu.welcome();		
		do {			
			do {
				menu.mainMenu(oper.defdirectory);
				try {
					op = sc.nextInt();
				}catch(Exception e) {
					System.out.println(op);
					System.out.println(e);
				}
			}while (op<1 || op>7);
			if (op>0 && op<7) {
				switch(op) {
					case 1:
						menu.insertDirectory();
						a = sc.next();
						try {
							oper.workDirectory(a);
						}catch(Exception e) {
							menu.sorry();
							System.out.println(e);
						}						
						break;
					case 2:
						menu.insertNew();
						a = sc.next();
						try {
							oper.addNewFile(a);
						}catch(Exception e) {
							menu.sorry();
							System.out.println(e);
						}						
						break;
					case 3:
						menu.insertDel();
						a = sc.next();
						try {
							oper.delFile(a);
						}catch(Exception e) {
							menu.sorry();
							System.out.println(e);
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
							BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
							oper.writeFile(a,b,dis);
							dis.close();
						}catch(Exception e) {
							menu.sorry();
						}
						System.out.println("Write!");
						
						break;
					case 6:
						menu.insertDirectory();
						a = sc.next();
						menu.readFile();
						b=sc.next();
						try {
							oper.readFile(a,b);
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
		}while(op!=7);
		menu.bye();

	}

}

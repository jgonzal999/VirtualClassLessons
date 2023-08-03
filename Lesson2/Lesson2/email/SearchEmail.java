package email;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import email.Operations;
import email.Menus;


public class SearchEmail {

	public static void main(String[] args) {
		Menus menu = new Menus();
		Operations oper = new Operations();
		Scanner sc = new Scanner(System.in);
		int op;
		char ex ='n';
		//main
		menu.welcome();		
		do {
			do {
				menu.mainmenu();
				op = sc.nextInt();
			}while (op<1 || op>4);
			if (op>0 && op<4) {
				switch(op) {
					case 1:
						menu.insertnew();
						String a = sc.next();
						oper.addEmail(a);;
						break;
					case 2:
						menu.insertdel();
						String b = sc.next();
						boolean find=oper.delEmail(b);
						if(!find) {
							System.out.println(" Sorry I don't find: "+b);
						}						
						break;
					case 3:
						menu.insertsearch();
						String c = sc.next();
						ArrayList<String> emailsfounded=oper.searchEmail(c);
						if(emailsfounded.isEmpty()) {
							System.out.println(" Sorry I don't find any email that contains: "+c);
						}else {
							Iterator<String> itr=emailsfounded.iterator();
							while(itr.hasNext()){
								System.out.println(" Founded: "+itr.next());
							}
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
		}while(op!=4);
		menu.bye();


	}

}

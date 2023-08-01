package calculator.menu;

public class Menus {
	public void welcome() {
		System.out.println("Welcome to my Calculator");
	}
	public void mainmenu() {
		System.out.println("\nPlease select the operation:\n\n 1.Addition       (a+b)\n 2.Substraction   (a-b)\n 3.Multiplication (a*b)\n 4.Division       (a/b)\n\n 5.QUIT");
	}
	public void insertnumber(char num) {
		System.out.println("Please insert number "+num+": ");
	}
	public void result(String oper, double res) {
		System.out.printf("The Result of "+oper+" : %.2f\n",res);
	}
	public void cont() {
		System.out.println("Do you really want to quit the app? (y/n): ");
	}
	public void bye() {
		System.out.println("Bye, thank you for using our products!");
	}

}

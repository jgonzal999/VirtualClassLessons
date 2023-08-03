package email;

public class Menus {
	public void welcome() {
		System.out.println("Welcome to Email Administration");
	}
	public void mainmenu() {
		System.out.println("\nPlease select the operation:\n\n 1.Add Email\n 2.Delete Email\n 3.Search Email\n\n 4.QUIT");
	}
	public void insertnew() {
		System.out.println("Please insert new Email: ");
	}
	public void insertdel() {
		System.out.printf("Please insert Email to delete (complete): ");
	}
	public void insertsearch() {
		System.out.printf("Please insert Email to search (complete or part of it): ");
	}
	public void cont() {
		System.out.println("Do you really want to quit the app? (y/n): ");
	}
	public void bye() {
		System.out.println("Bye, thank you for using our products!");
	}


}

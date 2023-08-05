package filehandling;

public class Menus {
	public void welcome() {
		System.out.println("Welcome to File Handling");
	}
	public void mainmenu() {
		System.out.println("\nPlease select the operation:\n\n 1.Add new file\n 2.Delete file\n 3.List files\n 4.Write to an existing file \n 5.QUIT");
	}
	public void insertnew() {
		System.out.println("Please insert new file: ");
	}
	public void insertdel() {
		System.out.printf("Please insert file to delete (complete): ");
	}
	public void insertsearch() {
		System.out.printf("Please insert file to search (complete or part of it): ");
	}
	public void insertfile() {
		System.out.printf("Please insert file to write on: ");
	}
	public void inserttext() {
		System.out.printf("Please insert text: ");
	}
	public void cont() {
		System.out.println("Do you really want to quit the app? (y/n): ");
	}
	public void bye() {
		System.out.println("Bye, thank you for using our products!");
	}


}

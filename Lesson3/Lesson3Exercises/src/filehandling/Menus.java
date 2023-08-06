package filehandling;

public class Menus {
	public void welcome() {
		System.out.println("Welcome to File Handling");
	}
	public void mainMenu() {
		System.out.println("\nPlease select the operation:\n\n 1.Add new file\n 2.Delete file\n 3.List files\n 4.Write to an existing file \n 5.QUIT");
	}
	public void insertNew() {
		System.out.println("Please insert new file: ");
	}
	public void insertDel() {
		System.out.printf("Please insert file to delete (complete): ");
	}
	public void insertSearch() {
		System.out.printf("Please insert directory to list it");
	}
	public void insertDirectory() {
		System.out.printf("Please insert directory to list it");
	}
	public void insertFile() {
		System.out.printf("Please insert file to write on: ");
	}
	public void insertText() {
		System.out.printf("Please insert text: ");
	}
	public void cont() {
		System.out.println("Do you really want to quit the app? (y/n): ");
	}
	public void bye() {
		System.out.println("Bye, thank you for using our products!");
	}


}

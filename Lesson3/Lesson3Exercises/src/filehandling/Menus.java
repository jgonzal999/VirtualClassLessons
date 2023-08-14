package filehandling;

public class Menus {
	public void welcome() {
		System.out.println("*** Welcome to File Handling ***");
	}
	public void mainMenu(String a) {
		System.out.println("\nWorking Directory: "+a.replace("//", "/"));
		System.out.println("\nPlease select the operation:\n\n 1.Add work directory\n 2.Add new file\n 3.Delete file\n 4.List files\n 5.Write to an existing file \n 6.Read an existing file \n\n 7.QUIT");
	}
	public void insertNew() {
		System.out.println("Please insert new file: ");
	}
	public void insertDel() {
		System.out.printf("Please insert file to delete (complete): ");
	}
	public void insertDirectory() {
		System.out.printf("Please insert directory ('d' for default): ");
	}
	public void insertFile() {
		System.out.printf("Please insert file to write on: ");
	}
	public void readFile() {
		System.out.printf("Please insert file to read: ");
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
	public void sorry() {
		System.out.println("Sorry, try it again!");
	}


}

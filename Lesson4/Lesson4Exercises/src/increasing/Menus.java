package increasing;

public class Menus {
	public void welcome() {
		System.out.println("*** Welcome to Longest Increasing Subsequence Finder ***\n");
	}
	public void mainMenu() {
		System.out.println("\nPlease select the operation:\n\n 1.Start\n\n 2.QUIT");
	}
	public void insertSize() {
		System.out.println("- First I am going to create a list of random numbers:");
		System.out.println("  1. Please insert the length of the random list of numbers: ");
	}
	public void insertNumberValues() {
		System.out.printf("  2. Please insert max value of each element: ");
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

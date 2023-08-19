package fixbugs;
import java.util.ArrayList;
import java.util.Scanner;

public class FixBugs {
	static String[] arr = {"1. I wish to review my expenditure",
            "2. I wish to add my expenditure",
            "3. I wish to delete my expenditure",
            "4. I wish to sort the expenditures",
            "5. I wish to search for a particular expenditure",
            "6. Close the application"
    };
	static int  slen = arr.length;
	static ArrayList<Integer> expenses = new ArrayList<Integer>();
    static int options=0;
    
// Main
	public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        //initial values
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        optionsSelection();
    }
	
// Methods
    private static void optionsSelection() {
    	Scanner sc = new Scanner(System.in);
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
        }        
        System.out.println("\nEnter your choice:\t");
        try {
        	options =  sc.nextInt();
        }catch (Exception e) {
        	options=100;
        }
        switch (options){
        	case 1:
        		System.out.println("Your saved expenses are listed below: \n");
                System.out.println(expenses+"\n");
                optionsSelection();
                break;
            case 2:
                System.out.println("Enter the value to add your Expense: \n");
                int value = sc.nextInt();
                expenses.add(value);
                System.out.println("Your value is updated\n");
                System.out.println(expenses+"\n");
                optionsSelection();
                break;
            case 3:
                System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                int con_choice = sc.nextInt();
                if(con_choice==options){
                    expenses.clear();
                    System.out.println("Expenses: "+expenses+"\n");
                    System.out.println("All your expenses are erased!\n");
                } else {
                    System.out.println("Oops... try again!");
                }
                optionsSelection();
                break;
            case 4:
                sortExpenses(expenses);
                optionsSelection();
                break;
            case 5:
            	System.out.println("Enter the expense you need to search:\t");
                int x = sc.nextInt();      
            	searchExpenses(expenses,x);
                optionsSelection();
                break;
            case 6:
                closeApp();
                break;
            default:
                System.out.println("You have made an invalid choice! Please try again\n");
                optionsSelection();
                break;
           }

    }
    
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    
    private static void searchExpenses(ArrayList<Integer> arrayList,int x) {
        int leng = arrayList.size();          
        //Complete the method
        //I use Linear Search because original ArrayList is not a sorted list and we could have more than one same value
        boolean find =false;
        for (int i=0;i<leng;i++) {
			if(arrayList.get(i)==x) {
				System.out.println("\nValue: "+x+" founded at index: "+i);
				find=true;
			}
		}
        System.out.println("\n");
        if (!find) System.out.println("Value: "+x+" not founded !!!\n");
    }
    
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
        //Complete the method. The expenses should be sorted in ascending order.
        //I use Quick Sort method
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(arrayList);
        sort(arr,0,arrlength-1);
        System.out.println("Your sorted expenses are listed below: \n");
        System.out.println(arr+"\n");        
    }
    
    static int partition(ArrayList<Integer> arr,int low, int high) {
		int pivot =arr.get(high);
		int i=low-1;
		for (int j=low;j<high;j++) {
			if (arr.get(j)<=pivot) {
				i++;
				int temp =arr.get(i);
				arr.set(i,arr.get(j));
				arr.set(j,temp);						
			}
		}
		int temp = arr.get(i+1);
		arr.set((i+1),arr.get(high));
		arr.set(high,temp);		
		return i+1;
	}
    
	static void sort(ArrayList<Integer> arr,int low,int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}
}

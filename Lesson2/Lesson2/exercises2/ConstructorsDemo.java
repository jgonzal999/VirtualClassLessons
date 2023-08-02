package exercises2;

public class ConstructorsDemo {

	public static void main(String[] args) {
		//default constructor
		Employee emp1=new Employee();
		Employee emp2=new Employee();

		emp1.display();
		emp2.display();
		
		//parameterized constructor
		Student std1 = new Student(1,"Akash");
		Student std2 = new Student(2,"Isabel");
		std1.display();
		std2.display();


	}

}

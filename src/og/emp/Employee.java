package og.emp;

public class Employee {
	// constructor
	public Employee() {
		System.out.println("Default Constructor");
	}
	 //method
	public void empid() {
		System.out.println("I am in method");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empid();
	}

}

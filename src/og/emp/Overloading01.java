package og.emp;

public class Overloading01 extends Overloading {
	// Non Parameterized Constructor
	public Overloading01() {
		super(234);
		    System.out.println("Default Constructor");
		}
	// Parameterized Constructor
	public Overloading01(int empId) {
		System.out.println("int para constructor :" + empId);
	}
	public static void main(String[] args) {
		new Overloading01();
		new Overloading01(100);
	}
	

}


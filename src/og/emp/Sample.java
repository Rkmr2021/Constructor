package og.emp;

public class Sample {
	// Non parameterized constructor
	public Sample() {
		System.out.println("Default Constructor");
	}
	// Parameterized constructor
	public Sample(int empId) {
		System.out.println("Int para constructor :" + empId);
	}
	// Parameterized constructor
	public Sample(String EmpName, float empSalary) {
		System.out.println("order para constructor :" +EmpName + "\t" +empSalary);
	}
	 // method
	public void EmpDetails(String Address, long phn_no,char Gender) {
		System.out.println("Address of Employee :" + Address);
		System.out.println("Employee phone no. :" + phn_no);
		System.out.println("Gender of Employee :" + Gender);
		
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		 new Sample(100);
		 new Sample("Rahul",34563.13f);
		s.EmpDetails("Delhi", 9709335407l, 'M');
	}

}

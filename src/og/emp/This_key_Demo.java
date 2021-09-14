package og.emp;

public class This_key_Demo {
	
	public This_key_Demo() {
		this("Rahul",34567.50f);
		System.out.println("Default Constructor");
	}
	public  This_key_Demo(int empId) {
		System.out.println("Employee Id is :" + empId);
		}
	public This_key_Demo(String EmpName, float EmpSal) {
		this(121);
		System.out.println("Employee Name is :" + EmpName);
		System.out.println("Employee Salary is :" + EmpSal);
	}
	public void Employee(long  phn_no, char  Gender) {
		System.out.println("Employee phone number :" + phn_no);
		System.out.println("Gender of Employee:" + Gender);
		}
	public static void main(String[] args) {
		This_key_Demo  E1 = new This_key_Demo();
		E1.Employee(7654879087l, 'M');
		
	    }
	}


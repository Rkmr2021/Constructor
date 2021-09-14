package og.emp;

public class Employee03 {
// Non Parameterized Constructor
	public Employee03() {
		this("Rahul",43562.98f);
		System.out.println("Default Constructor");
	}
	// Parameterized Constructor
	public Employee03(int empId) {
		System.out.println("EmployeeId_Int :"+ empId);	
	}
	public Employee03(String EmpName,float EmpSalary) {
		this(230);
		System.out.println("Employee Name_SF:" + EmpName); 
		System.out.println("Employee Salary_SF :" +  EmpSalary);
		}
	
	//method
	public void Employee(long Phn_no) {
		System.out.println("Employee phone no. :" + Phn_no);
	}
	public static void main(String[] args) {
		Employee03 E = new Employee03();
		E.Employee(9709125408l);
	}
	
}

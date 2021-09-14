package og.emp;

public class Employee01 {
	// parameterized Constructor
	  public Employee01(int empId) {
		  System.out.println("Employee Id :" + empId);
		  
	  }
	  public Employee01(long phn_no, float salary) {
		  System.out.println("Employee phone number :"+ phn_no );
		  System.out.println("Employee Salary :" +     salary);
		
	}
	//method
	   public void EmpName(String EName ) {
		System.out.println("Employee Name is :" + EName);
		}
	   
	   public static void main (String[]args) {
		  
		  Employee01 e2 =   new Employee01(897888888l,12345.78f);
		   new Employee01(100);
		   e2.EmpName("rahul");
		
		   
		   
	   }
		

	}

	



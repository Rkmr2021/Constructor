package og.emp;

public class MyDrivers {
	public MyDrivers() {
		this(15000.60f);
		System.out.println("Loading my drivers");
	}
	public MyDrivers(String name) {
		System.out.println("Loading my drivers-Name:" +name);
		
	}
	public MyDrivers(int count) {
		this("Rahul Kumar");
		System.out.println("Loading my drivers-Count:" +count);
	}
	public MyDrivers(float salary) {
		this(100);
		System.out.println("Loading my drivers-Salary:" +salary);
	}
	public void display() {
		System.out.println("I am in display method");
	}
	public static void main(String[]args) {
		MyDrivers drivers = new MyDrivers();
		drivers.display();
	}
	

}

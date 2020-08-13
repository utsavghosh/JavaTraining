/**
 * 
 */

/**
 * @author BYO
 *
 */
public class Employee {
	String firstName;
	String lastName;
	int empid;
	public void fullName() { 
		firstName = "Harry";
		lastName = "Potter";
		System.out.println("this method is printing the full name of the employee");
		System.out.println(firstName+" "+lastName);
	}
	public void employeeID(int b) {
		System.out.println("this method is printing the employee ID of the employee");
		System.out.println(b);
	}

}

/**
 * 
 */

/**
 * @author UG
 *
 */

/** 
 * 
 * This contains some examples of state and behavior i.e. answers to question 1
 * 1> The number 1729. 
 * State: Integer; Behavior: It is the smallest number expressible as the sum of two cubes in two different ways
 * 
 * 2> Stars. 
 * State: Gas, same chemical composition; Behavior: Constant combustion, color changes as per the temperature
 * 
 * 3> Mobile Phone. 
 * State: Current screensaver, time, battery, main screen icons
 * Behaviors: Power on/off, volume on/off, brightness up/down, clicking on apps would open them 
 */ 
 
public class Student {

	/**
	 * @param args
	 */
	//declaring student variables
	String firstName;
	String lastName;
	int rollno;
	int studentid;
	public void fullName() { 
		firstName = "Harry";
		lastName = "Potter";
		System.out.println("this method is printing the full name of the student");
		System.out.println(firstName+" "+lastName);
	}
	public void rollno(int a) {
		System.out.println("this method is printing the roll number of the student");
		System.out.println("Roll number is "+ a);
	}
	public void studentID(int b) {
		System.out.println("this method is printing the student ID of the student");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.fullName();
		obj1.rollno(10);
		obj1.studentID(123);		

	}

}

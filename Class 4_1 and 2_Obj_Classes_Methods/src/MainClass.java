/**
 * 
 */

/**
 * @author BYO
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

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.fullName();
		obj1.rollno(10);
		obj1.studentID(123);	
		Employee obj2 = new Employee();
		obj2.fullName();
		obj2.employeeID(123);
		Bank obj3 = new Bank();
		obj3.fullName();
		
	}

}

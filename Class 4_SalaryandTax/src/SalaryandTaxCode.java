/**
 * 
 */

/**
 * @author UG
 *
 */
import java.util.*;

public class SalaryandTaxCode {
	private String empname;
	private double basicSal, HRA, DA, taxPer;
	private double totalSal;
	
	public void userInput() {
		Scanner det = new Scanner(System.in);
		System.out.println("enter the name of the employee");
		empname = det.next();
		System.out.println("enter the basic salary of the employee");
		basicSal = det.nextInt();
		System.out.println("enter the HRA of the employee");
		HRA = det.nextInt();
		System.out.println("enter the DA of the employee");
		DA = det.nextInt();
		System.out.println("enter the tax percent of the employee");
		taxPer = det.nextInt();
		calcTax();
					
	}
	public void calcTax() { // total salary = total gross income - tax percent of total gross income
		totalSal = (basicSal+HRA+DA)-((taxPer/100)*(basicSal+HRA+DA));
				
	}
	
	public void salOutput() {
		System.out.println("Salary of the employee "+ empname +" after tax is " + totalSal);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SalaryandTaxCode obj1 = new SalaryandTaxCode();
		obj1.userInput();
		obj1.salOutput();

	}

}

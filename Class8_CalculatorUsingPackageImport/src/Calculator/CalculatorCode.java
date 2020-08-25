/**
 * 
 */
package Calculator;

/**
 * @author UG
 *
 */
public class CalculatorCode {
	
	public double substract(double a, double b) {
		return a-b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	public int factorial(int a) {
		int b=1;
		for (int i=1;i<=a;i++)
			b*=i;
		return b;
	}
	public int reverse (int a) {
		int b = 0;
		while(a != 0) { //loop till the number is not equal to 0
			int i = 0;
			i = a%10; // saving the remainder in a temp variable
			b = 10*b+i; // increasing a 'tens' form into a number and then adding the remainder in its 'one's' place
			a = a/10; // decreasing the number of digits of the number by 1 using data type conversion
		
		}
		return b;
	}

}

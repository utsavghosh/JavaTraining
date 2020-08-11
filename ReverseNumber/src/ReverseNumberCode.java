/**
 * 
 */

/**
 * @author UG
 *
 */
public class ReverseNumberCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a= 123456; 
		int b = 0;
		while(a != 0) { //loop till the number is not equal to 0
			int i = 0;
			i = a%10; // saving the remainder in a temp variable
			b = 10*b+i; // increasing a 'tens' form into a number and then adding the remainder in its 'one's' place
			a = a/10; // decreasing the number of digits of the number by 1 using data type conversion
		
		}
		System.out.println("Reverse of 123456 is : "+ b);

	}

}

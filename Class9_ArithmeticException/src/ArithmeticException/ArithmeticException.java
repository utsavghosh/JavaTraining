package ArithmeticException;
import java.lang.Throwable;

public class ArithmeticException extends Throwable{

	public static void main(String[] args) throws ArithmeticException {
		int a = 30, b = 0; 
		int c = a/b;  // cannot divide by zero 
		System.out.println ("Result = " + c); 
	}

}

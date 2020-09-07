package NullPointerException;
import java.lang.*;

public class NPException extends Exception {

	public static void main(String[] args) throws NullPointerException  {
		String s = null;
		  System.out.println( s.toString() );

	}
}


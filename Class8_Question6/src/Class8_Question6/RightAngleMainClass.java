package Class8_Question6;
import java.util.*;

public class RightAngleMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the dimentions of a triangle first two sides then the hypotenuse");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		RightAngleCodeClass obj = new RightAngleCodeClass();
		obj.func(a, b, c);
		
	}

}

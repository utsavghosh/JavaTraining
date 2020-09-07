package Class8_Question7;
import java.util.*;

public class MissingLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the sequence like a word");
		String s = scan.next();
		int i = s.length();
		char [] arr1 = new char[i];
		for(int j=0; j<i;j++) 
			arr1[j]=s.charAt(j);
		int a, b;
		for (int j=0;j<i-1;j++) {
			a=arr1[j];
			b=arr1[j+1];
			while(b-a>1) {
				System.out.println("Missing element is "+(char)(a+1));
				a++;
			}
		}
		
		

		
	}		

}

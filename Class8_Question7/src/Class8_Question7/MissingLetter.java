package Class8_Question7;
import java.util.*;
//please help me with the logic. Mine looks flawed

public class MissingLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String arr[];
		final String [] arr= new String [] {"a","b","c","d","e","f","g",
			    "h","i","j","k","l","m","n",
			    "o","p","q","r","s","t","u",
			    "v","w","x","y","z"
		};
		System.out.println("Enter number of characters in sequence");
		Scanner scan = new Scanner (System.in);
		int i = scan.nextInt();
		String[] arr1 = new String[i];
		
		for(int j = 0; j<i;j++) {
			System.out.println("Enter the letter sequence");
			arr1[j]=scan.next();
		}	
			
		int counter =0;
		String s;
		for (int j=0;j<26;j++) {
			if(arr[j]==arr1[j]) {
				for(int l = 0;l<i;l++) {
					if(arr[l]==arr1[l]) {
						counter++;
						 
					}
					else 
						s = arr[l];
				}
				
			}
		}
		if (counter < i)
			System.out.println("Missing letter in sequence is "+ s);
		else 
			System.out.println("Letters are in sequence");

	}

}

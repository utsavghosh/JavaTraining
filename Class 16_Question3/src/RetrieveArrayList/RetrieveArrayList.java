package RetrieveArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Nakul");
	      alist.add("Uru");
	      alist.add("Eshu");
	      alist.add("Feba");
	      alist.add("Sanja");
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Utsav" at the first position
	      alist.add(0, "Utsav");
	  
	      //displaying elements
	      System.out.println(alist);
	      
	      System.out.println("Enter the element you want to see the value of");
	      Scanner scan = new Scanner(System.in);
	      int a = scan.nextInt();
	      System.out.println("Value at position " + a + " " + alist.get(a));
	      

	}

}

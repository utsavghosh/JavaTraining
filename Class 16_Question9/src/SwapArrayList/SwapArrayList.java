package SwapArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapArrayList {

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
	      System.out.println("\n Adding Utsav, how on earth did we forget him \n");
	      System.out.println(alist);
	      
	      System.out.println("\nEnter the elements you want to search in the list");
	      Scanner scan = new Scanner(System.in);
	      int a = scan.nextInt();
	      int b = scan.nextInt();
	      
	      
	      Collections.swap(alist,a,b);

	      System.out.println("\nArrayList after swapping\n");
	      
	      for (String s : alist) {
	    	  System.out.println(s);
	      }

	}

}

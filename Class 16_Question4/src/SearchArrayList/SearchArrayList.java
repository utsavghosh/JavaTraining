package SearchArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchArrayList {

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
	      
	      System.out.println("\nEnter the element you want to search in the list");
	      Scanner scan = new Scanner(System.in);
	      String a = scan.next();
	      boolean b = alist.contains(a);
	      if (b)
	    	  System.out.println(a + " is present in the list");
	      else
	      System.out.println(a + " is not present in the list");

	}

}

package ReverseArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

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
	      
	     Collections.reverse(alist);
	      
	      
	      System.out.println("\n Reversed new array list is \n");
	      System.out.println(alist);

	}

}

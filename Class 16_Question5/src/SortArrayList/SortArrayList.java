package SortArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SortArrayList {

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
	      
	      Collections.sort(alist);
	      System.out.println("\nSorted array list is : \n");
	      
	      for (String s : alist) {
	    	  System.out.println(s);
	      }
	      
	         
	      

	}

}

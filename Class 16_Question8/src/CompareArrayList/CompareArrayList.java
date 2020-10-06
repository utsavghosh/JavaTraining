package CompareArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayList {

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
	      
	      ArrayList<String> alist1=new ArrayList<String>();  
			
	      alist1.add("Nakul");
	      alist1.add("Uru");
	      alist1.add("Eshu");
	      alist1.add("Feba");
	      alist1.add("Sanja");
	  
	      //displaying elements
	      System.out.println(alist1);
	  
	      //Adding "Utsav" at the first position
	      alist1.add(0, "Utsav");
	  
	      //displaying elements
	      System.out.println("\n Adding Utsav, how on earth did we forget him \n");
	      System.out.println(alist1);
	      
	      Collections.sort(alist);
	      Collections.sort(alist1);
	      
	      boolean isEqual = alist.equals(alist1);
	      if(isEqual) 
	    	  System.out.println("\n The two array lists are equal");
	      else
	    	  System.out.println("\n The two array lists are not equal");
	      
	      
	      
	      

	}

}

package CopyArrayList;

import java.util.ArrayList;


public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();  
		ArrayList<String> alist1=new ArrayList<String>();
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
	      
	      for (String s : alist) {
	    	  alist1.add(s);
	      }
	      System.out.println("\n Copied new array list is \n");
	      System.out.println(alist1);

	}

}

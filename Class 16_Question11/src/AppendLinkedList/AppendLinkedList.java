package AppendLinkedList;

import java.io.*; 
import java.util.LinkedList; 

public class AppendLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		      // creating an empty LinkedList 
		      LinkedList list = new LinkedList(); 
		  
		      // use add() method to add elements in the list to the end
		      list.add("Rathi"); 
		      list.add("Sanja"); 
		      list.add("Uru"); 
		      list.add("Eshu"); 
		      list.add("Fubu"); 
		  
		      // Output the present list 
		      System.out.println("\nThe list is:" + list +" But how can we forget Utsav! Let's add him at the end\n"); 
		  
		      // Adding new elements to the end 
		      list.add("Utsav"); 
		      
		  
		      // printing the new list 
		      System.out.println("The new List is:" + list); 
		   } 
		



}

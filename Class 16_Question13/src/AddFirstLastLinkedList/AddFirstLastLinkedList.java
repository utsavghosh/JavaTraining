package AddFirstLastLinkedList;

import java.util.*;

public class AddFirstLastLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Nakul");
		list.add("uru");
		list.add("Feba");
		list.add("Esha");
		list.add("Sanja");
		
		System.out.println("\nChronological order of list travesing result:\n"); 
		
		for (int i = 0; i <= list.size() - 1 ; i++) {
			System.out.println(list.get(i));
		}
		
		// Inserting at first position 
        list.addFirst("Utsav"); 
  
        // Inserting at last position 
        list.addLast("Ghosh"); 
  
        // Print the updated LinkedList 
        System.out.println("Updated Linked list: "
                           + list); 

	}

}

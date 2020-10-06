package ReverseIterateLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseIterateLinkedList {

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
		
		System.out.println("\nReverse order of list travesing result:\n"); 

		for (int i = list.size() - 1; i >= 0 ; i--) {
			System.out.println(list.get(i));
		}

	}

}

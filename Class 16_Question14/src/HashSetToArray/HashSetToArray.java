package HashSetToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new Set of String objects
        HashSet<String> setOfStrs = new HashSet<>();
        // Add elements to a HashSet
        setOfStrs.add("Utsav");
        setOfStrs.add("Nakul");
        setOfStrs.add("Feba");
        setOfStrs.add("Uru");
        // Create an array of size equivalent to Set size
        // String [] arrOfStrs = new String[setOfStrs.size()];
        String[] arrOfStrs = new String[5];
        // Initialize the array.
        String[] recvArr = setOfStrs.toArray(arrOfStrs);
        // Print the Set
        for (String data : recvArr)
            System.out.println(data);

	}

}

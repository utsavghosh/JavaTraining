

package CreateArrayList;
import java.util.*; 

/**
 * @author BYO
 *
 */
public class CreateArrayList {

	/**
	 * @param args
	 */
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
		  
		      //Adding "Utsav" at the third position
		      alist.add(2, "Utsav");
		  
		      //displaying elements
		      System.out.println(alist);
		   }  
		

	

}

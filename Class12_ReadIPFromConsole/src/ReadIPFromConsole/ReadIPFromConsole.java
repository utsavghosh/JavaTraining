package ReadIPFromConsole;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class ReadIPFromConsole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Enter data using BufferReader 
		System.out.println("Enter anything in the console \n");
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
        
        System.out.println("You entered the following in the console \n");
        // Printing the read line 
        System.out.println(name); 

	}

}

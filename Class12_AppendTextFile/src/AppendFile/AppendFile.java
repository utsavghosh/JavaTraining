package AppendFile;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class AppendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The below block will write the 'Added Text' into the file and then print done
		try {
	         
	         File f1 = new File("C:\\Users\\BYO\\eclipse-workspace\\Class12_ReadLineByLine\\File1.txt");
	         String text = "Added text";
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }
	         FileWriter fileWritter = new FileWriter("C:\\Users\\BYO\\eclipse-workspace\\Class12_ReadLineByLine\\File1.txt",true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(text);
	         bw.close();
	         
	         System.out.println("Done");
	      } catch(IOException e){
	         e.printStackTrace();
	      }
		
		//The below block will read the text from File1 and then print it
		try {

		      // Creates a FileInputStream
		      FileInputStream file = new FileInputStream("C:\\Users\\BYO\\eclipse-workspace\\Class12_ReadLineByLine\\File1.txt");
		      
		   // Creates a BufferedInputStream
		      BufferedInputStream input = new BufferedInputStream(file);

		      // Reads first byte from file
		      int i = input.read();

		      while (i != -1) {
		        System.out.print((char) i);

		        // Reads next byte from the file
		        i = input.read();
		      }
		      input.close();
		    }

		    catch (Exception e) {
		      e.getStackTrace();
		    }

	}

}

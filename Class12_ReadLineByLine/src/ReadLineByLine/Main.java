package ReadLineByLine;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Main {
  public static void main(String[] args) {
	  try {

	      // Creates a FileInputStream
	      FileInputStream file = new FileInputStream("C:\\Users\\BYO\\eclipse-workspace\\Class12_ReadLineByLine\\File.txt");

	      // Creates a BufferedInputStream
	      BufferedInputStream input = new BufferedInputStream(file);

	      // Reads first byte from file
	      int i = input .read();

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

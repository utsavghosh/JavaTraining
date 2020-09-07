package FilesListFromFolder;
import java.io.File;
//this code gets all folder names under a folder

public class FilesListFromFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
		

	}

}

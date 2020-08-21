/**
 * 
 */
package InterfaceDeclaration;

/**
 * @author BYO
 *
 */
public class InterfaceDeclarationMainClass implements InterfaceDeclarationCode{
	public void insert() {
		System.out.println("Function to insert something");
	}
	public void delete() {
		System.out.println("Function to delete something");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDeclarationMainClass obj = new InterfaceDeclarationMainClass();
		obj.delete();
		obj.insert();
		

	}

}

package Class8_Question5;

import java.util.*;

public class InputData {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	
	int[][] arr = new int [a][3];
	void inputfunc() {
	for (int i = 0; i<a; i++) {
		System.out.println("\nEnter the length breadth and height of box ");
		for (int j = 0; j<3; j++) {
			arr[i][j] = scan.nextInt();
			}
		}
	}
	
	int calcVolm() {
		int sum = 0;
		
		for (int i =0; i<a; i++) {
			int k = 1;
			//System.out.println(i);
			for (int j = 0; j<3; j++) {
				k = k* arr[i][j];
				//System.out.println(k);
			}
		sum = sum+k;
		}
		return sum;
	}
	
	

}

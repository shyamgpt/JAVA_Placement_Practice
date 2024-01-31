//        Thinks you know before writing the code -->
//		-no of rows
//		-no of column
//		-What to print
	
package patternBasedProblems;

import java.util.Scanner;

public class Print1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i =1; 
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i =i+1;
		}
		

	}
}

//o/p -->
//*****
//*****
//*****
//*****
//*****

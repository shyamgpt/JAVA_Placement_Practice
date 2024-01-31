package patternBasedProblems;

import java.util.Scanner;

public class TriaanglePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		 int i =1;
		 while(i<=n) {
			 int j =1;
			 while(i>=j) {
				 System.out.print(i+j-1);
				 j=j+1;
			 }
			 System.out.println();
			 i=i+1;
		 }

	}

}

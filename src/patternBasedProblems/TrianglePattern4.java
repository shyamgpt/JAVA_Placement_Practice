package patternBasedProblems;

import java.util.Scanner;

public class TrianglePattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int n = s.nextInt();
	   int i =1;
	   while(i<=n) {
		   int j =1;
		   while(i>=j) {
			   System.out.print(i-j+1);
			  
			   j++;
		   }
		   System.out.println();
		   i++;
	   }

	}

}

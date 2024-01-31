package patternBasedProblems;

import java.util.Scanner;

public class TrianglePattern3 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = s.nextInt();
			 int i =1;
			 int p =1;
			 while(i<=n) {
				 int j =1;
				 while(i>=j) {
					 System.out.print(p);
					 p++;
					 j=j+1;
				 }
				 System.out.println();
				 i=i+1;
				
			 }
//			 p =p+1;
		
		}

	




}

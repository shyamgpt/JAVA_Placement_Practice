package pattern2;

import java.util.Scanner;

public class InvertedNumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		 int i =1;
		 
		 while(i<=n) {
			 int p =n-i+1;
			 int j =1;
			
			 while(j<=n-i+1) {
				 System.out.print(p);
				 j++;
			 }
			 System.out.println();
			 
			 i++;
					
			 
		 }

	}

}

package pattern2;

import java.util.Scanner;

public class mirrorImagePattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		


		
		int i =1;
		while(i<=n) {
//			int j--> for spaces
			int j =1;
			while(j<=i) {
				System.out.print(n);
				j=j+1;
			}
			
//			int k --> for '*'
			int k =1;
			while(k<n-i) {
				System.out.print(" ");
				k++;
			}
			System.out.println();

			i++;
			n--;
		}

	}

}

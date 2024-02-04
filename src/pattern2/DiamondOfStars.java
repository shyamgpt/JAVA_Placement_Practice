package pattern2;

import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			int space = 1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int star = 1;
			while(star<=i) {
				System.out.print("*");
				star++;
			}
			int decStar= i-1;
			while(decStar>=1) {
				System.out.print("*");
				decStar--;
				
			}
			
			System.out.println();
			i++;
		}

	}

}

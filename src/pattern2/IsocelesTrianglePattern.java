package pattern2;

import java.util.Scanner;

public class IsocelesTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			int k =1;
			while(k<=i) {
				System.out.print(k);
				k++;
				
			
		}
			int dec = i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec --;
			}

			System.out.println();
			i++;

		
		}
		
	}

}

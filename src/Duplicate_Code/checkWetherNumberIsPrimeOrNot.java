package Duplicate_Code;

import java.util.Scanner;

public class checkWetherNumberIsPrimeOrNot {
	
	public static void primeNumberCheck(int n) {
//		int div =2;
//		while(div<n-1) {
//			if(n % div != 0) {
//				
//				System.out.println("Number is prime");
//				div++;
//				
//			} else {
//				System.out.println("Number is composite");
//			}
		
//		}
		
		
		for(int i =2; i<n-1; ) {
			if(n % i == 0) {
				System.out.println("Not prime");
			}
			i++;
		}
		System.out.println("prime");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		primeNumberCheck(num);

	}

}

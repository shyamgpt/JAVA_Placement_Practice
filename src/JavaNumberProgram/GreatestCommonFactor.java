package JavaNumberProgram;

import java.util.Scanner;

public class GreatestCommonFactor {
	
	
	public static void GCD(int a , int b) {
	int gcd= 1;
	
	for(int i=1; i<=a && i<=b; i++) {
		if(a % i ==0 && b % i ==0 ) {
//			System.out.print(i+ " ");
			gcd=i;
			System.out.print(gcd+ " ");
			
			
			
		}
//		System.out.print(gcd+ " ");
	}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		int b = s.nextInt();
		GCD(a,b);
		
		
		}

	

}

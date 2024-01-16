package randomQuestion;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static boolean isPrime(int num) {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number for Prime Check");
//		int num = s.nextInt();
		
		if(num == 0 || num == 1) { 
			return false;
		}
		if(num == 2) {
			return true;
		}
		for(int i = 2; i<num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		
			 
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for Prime Check");
		int num = s.nextInt();
		
		boolean res = isPrime(num);
		System.out.println(res);

	}

}

package Selenium_javaInterviewRealQuestion;

import java.util.Scanner;

public class PrintPrimeNumber {
	
	Scanner s = new Scanner(System.in);
	
	
	public static boolean OddNum(int num) {
		for(int i =0; i<num; i++) {
			if(num%2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int num) {
		
//		if(num == 0 || num == 1) {
//			return false;
//		}
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =10;
		int num = 2;
		boolean res = isPrime(4);
		System.out.println(res);
		for(int i =0; i<count; i++) {
			if(isPrime(num) && OddNum(num)) {
				System.out.println(num);
				
			}
			num++;
		}
		

	}

}

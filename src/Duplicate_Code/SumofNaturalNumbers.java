//Problem Statement -->Java Program to Find Sum of Natural Numbers
package Duplicate_Code;

import java.util.Scanner;

public class SumofNaturalNumbers {
	
	public static int naturalNoSum(int n) {
		int sum =0;
		for(int i =1; i<=n; i++) {
			sum = sum+i;
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubSc
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the natural number");
	  int n = s.nextInt();
	  int res =naturalNoSum(n);
	  System.out.println("sum of of first "+n+" natural number is " +res);
		

	}

}

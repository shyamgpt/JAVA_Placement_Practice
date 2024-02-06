package RecursionConcept;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		
		int smallOutput =  fact(n-1);
		int output = n* smallOutput;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int res = fact(n);
		System.out.println(res);

	}

}

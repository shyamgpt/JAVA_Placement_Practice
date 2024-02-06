package RecursionConcept;

import java.util.Scanner;

public class NaturalNumberPrint {
	
	public static void printNaturalNumber(int n) {
		if(n==0) {
			return ;
		}
		
		printNaturalNumber(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		printNaturalNumber(n);
		

	}

}

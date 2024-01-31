package patternBasedProblems;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}

//o/p -->
//1234
//1234
//1234
//1234

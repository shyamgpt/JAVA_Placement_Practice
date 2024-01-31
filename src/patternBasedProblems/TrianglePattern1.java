package patternBasedProblems;

import java.util.Scanner;

public class TrianglePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(i>=j) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}
	

}

//o/p -->
//
//1
//12
//123
//1234
//12345


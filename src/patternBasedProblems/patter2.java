package patternBasedProblems;

import java.util.Scanner;

public class patter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
//			i = i+1;
			i++;
		}

	}

}

//O/p-->
//1111
//2222
//3333
//4444


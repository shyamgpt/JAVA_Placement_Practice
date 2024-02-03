package patternBasedProblems;

import java.util.Scanner;

public class CharacterPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				char jthChar = (char)('A'+i+j-2);
				System.out.print(jthChar);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

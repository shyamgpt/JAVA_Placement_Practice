package patternBasedProblems;

import java.util.Scanner;

public class CharacterPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i =1;
		int p =1;
		while(i<=n) {
			int j =1;
			while(i>=j) {
				char jthChar = (char)('A'+p-1);
				System.out.print(jthChar);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

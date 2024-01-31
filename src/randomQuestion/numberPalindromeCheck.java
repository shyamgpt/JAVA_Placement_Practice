package randomQuestion;

import java.util.Scanner;

public class numberPalindromeCheck {
	
	public static int palindromeCheck(int num) {
		int revseNum=0;
		//898
		while(num>0) {
			revseNum = revseNum*10 + num%10;
			num = num/10;
		}
		return revseNum;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for palindrom check");
		int pNum= s.nextInt();
		int resNum = palindromeCheck(pNum);
		System.out.println("resNum->"  +resNum);
		System.out.println("pNum->" +pNum);
		if(resNum == pNum) {
			System.out.println("palindrome : Yes");
		}
		else {
			System.out.println("Palindrome: No");
		}
		

	}

}

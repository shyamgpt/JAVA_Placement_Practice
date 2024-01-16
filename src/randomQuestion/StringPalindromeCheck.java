package randomQuestion;

import java.util.Scanner;

public class StringPalindromeCheck {
	
	public static boolean checkPalindrome(String input) {
//		boolean result = true;
		int length = input.length();
		for(int i =0; i<=length/2; i++){
			if(input.charAt(i) != input.charAt(length-i-1)) {
				System.out.println(input.charAt(i));
				System.out.println(input.charAt(length-i-1));
				return false;
			}
			break;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the input string");
		
		String input = s.next();
		
	boolean res = 	checkPalindrome(input);
	
	System.out.println(res);
		


		
		

	}

}

package randomQuestion;

import java.util.Scanner;

public class StringContainsVowel {
	
	
	
	public static boolean stringInVowels(String input) {
		
		boolean res = input.toLowerCase().matches(".*[aeiou]");
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stringInput = new Scanner(System.in);
		
		System.out.println("Enter the input string for vowel check");
		
		String input = stringInput.next();
		
		boolean result = stringInVowels(input);
	
		System.out.println(result);
		
		

	}

}

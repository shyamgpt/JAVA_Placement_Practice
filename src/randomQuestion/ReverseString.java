package randomQuestion;

import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String str) {
		String revrString = "";
		char ch;
		for(int i =0; i<str.length(); i++) {
			 ch = str.charAt(i);
			 revrString = ch+ revrString;
		}
		return revrString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.next();
		String reverse = reverseString(str);
		System.out.println("Reverse String " + reverse);

	}

}

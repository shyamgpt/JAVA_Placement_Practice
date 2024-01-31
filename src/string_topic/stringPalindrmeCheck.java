package string_topic;

import java.util.Scanner;

public class stringPalindrmeCheck {
	
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
		
	}
	
	public static boolean palindromeCheck(String str) {
		int i =0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		
		}
		return true;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str =	inputString();
	boolean rws =palindromeCheck(str);
	System.out.println(rws);
	}

}

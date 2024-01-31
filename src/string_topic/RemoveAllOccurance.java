package string_topic;

import java.util.Scanner;

public class RemoveAllOccurance {
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}
	
	public static char inputChar() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input char");
		char ch = s.next().charAt(0);
		return ch;
		
	}
	
	public static String removeAllOccuranceOfChar(String str, char ch) {
		String resultStr="";
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) != ch) {
				resultStr.append
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

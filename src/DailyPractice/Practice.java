package DailyPractice;

import java.util.Scanner;

public class Practice {
	
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Stirng");
		String str = s.nextLine();
		return str;
	}
	
	public static String inputString(String str) {
		
		String reverseStr="";
		for(int i =0; i<str.length(); i++) {
			reverseStr =str.charAt(i)+reverseStr;
			
		}
		return reverseStr;
	}
	
	public static void PrintStr(String str) {
		for(int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		String inStr =inputString();
		String res = inputString(inStr);
		PrintStr(inStr);
		System.out.println();
		PrintStr(res);
		
		
	}
}

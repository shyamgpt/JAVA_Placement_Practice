package string_topic;

import java.util.Scanner;

public class ReverseString {
	
	public static String inputString() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
		
	}
	
	public static String  revrString(String str) {
		
		
		String reverseStr ="";
		for(int i=0; i<str.length(); i++) {
			reverseStr = str.charAt(i)+reverseStr;
			
		}
		return reverseStr;
		
	}
	
	
	public static boolean palindromCheck(String str1) {
	String rStr = 	revrString(str1);
	String oriStr =	inputString();
	if(rStr.equals(oriStr)) {
		return true;
	}else {
		return false;
	}
		
	}
	
	public static void printString(String str) {
		for(int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i) +" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = inputString();
		printString(str);
	String revString =	revrString(str);
	System.out.println();
	
	printString(revString);
	System.out.println(palindromCheck(str));

	}
	
	/*public static boolean isPalindrome(String str) {
    StringBuilder sb = new StringBuilder(str);

    // reverse the string
    sb.reverse();

    // check if the reversed string is equal to the original string
    return str.equals(sb.toString());
}
	 * 
	 * */

}

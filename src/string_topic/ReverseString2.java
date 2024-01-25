package string_topic;

import java.util.Scanner;

public class ReverseString2 {
	
	public static String inputString() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
		
	}
	
	public static String  revrString(String str) {
		
		
		String reverseStr ="";
		
		for(int i =str.length()-1; i>=0; i--){
			reverseStr = reverseStr+str.charAt(i);
			
		}
		return reverseStr;
		
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

	}

}

package DailyPractice;

import java.util.Scanner;

public class practice2 {
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		return str;
	}
	
	public static String RevrString(String str) {
		String RevStr1 = "";
		for(int i = str.length()-1; i>=0; i--) {
			System.out.println(i);
			RevStr1 = RevStr1+ str.charAt(i);
		}

		return RevStr1;
		
	}
	
//public static String  revrString(String str) {
//		
//		String reverseStr ="";
//		
//		for(int i =str.length()-1; i>=0; i--){
//			reverseStr = reverseStr+str.charAt(i);
//			
//		}
//		return reverseStr;
//		
//	}
	
	public static void printStr(String str) {
		for(int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = inputString();
		System.out.println(str.length());
		printStr(str);
		System.out.println();
		
		String res =RevrString(str);
		
		
		printStr(res);
		
		

	}

}

package string_topic;

import java.util.Scanner;

public class StringInNEqualPart {
	
	public static String inputString() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = s.nextLine();
		return str;
		
	}
	
	public static int inputN() {
		//N -> is  n equal part
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		return n;
	}

	
	public static String divideInNEqualPart(String str, int n) {
		int lenght = str.length();
		for(int i =0; i<lenght; i++) {
			String EqualPartString = str.substring(0, i+n);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =inputString();
		
		int length = str.length();
		f
		
		

	}

}

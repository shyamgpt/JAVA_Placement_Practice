package string_topic;

import java.util.Scanner;

public class printAllCharacter {
	
	public static String inputString() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}
	
	public static void PrintAllChar(String str) {
		for(int i =0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = inputString();
		PrintAllChar(str);

	}

}

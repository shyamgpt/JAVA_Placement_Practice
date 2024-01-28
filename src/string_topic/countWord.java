package string_topic;

import java.util.Scanner;

public class countWord {
	
	public static String inputString() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}
	
	public static void printString(String str) {
		for(int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+ " ");
		}
		
	}
	
	public static int countWord(String str) {
		int count =1;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) =='\n' || str.charAt(i) == '\t') {
				count ++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = inputString();
	printString(str);
	int res = countWord(str);
	System.out.println();
	System.out.println(res);
	

	}

}

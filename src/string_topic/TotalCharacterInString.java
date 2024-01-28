//Problem -->  Write a program to calculate the total number of characters in the String?

package string_topic;

import java.util.Scanner;

public class TotalCharacterInString {
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}
	
	public static int totalChar(String str) {
		int count =0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				count ++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = inputString();
        int res	= totalChar(str);
        System.out.println(res);
		

	}

}

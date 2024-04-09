package string_topic;

import java.util.Scanner;

public class CountCapitaLetterInString {

	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}

	public static int countCapitalLetter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = inputString();
		int res = countCapitalLetter(str);
		System.out.println(res);

	}

}

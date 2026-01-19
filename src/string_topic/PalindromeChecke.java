package string_topic;

import java.util.Scanner;

public class PalindromeChecke {

	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the input String");
		String str = s.nextLine();
		return str;
	}

	public static boolean palinDromeCheck(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
			
		}
		return true;

		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = inputString();
		boolean res = palinDromeCheck(str);
		System.out.println(res);

	}

}

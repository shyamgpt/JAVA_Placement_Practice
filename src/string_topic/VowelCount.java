package string_topic;

import java.util.Scanner;

public class VowelCount {

	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = inputString();

		int vCount = 0;
		int cCount = 0;
		str1 = str1.toLowerCase();
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u') {
				vCount++;
			} else if (str1.charAt(i) > 'a' && str1.charAt(i) < 'z') {
				cCount++;
			}

		}
		System.out.println(cCount);
		System.out.println(vCount);

	}

}

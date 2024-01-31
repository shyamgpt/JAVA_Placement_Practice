//Problem --> Java Program to count the total number of vowels and consonants in a string

package string_topic;

import java.util.Scanner;

public class VowelConsonatCount {
	
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = inputString();
		
		
		str = str.toLowerCase();
		int vCount = 0;
		int cCount =0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vCount++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
			
		}
		
		System.out.println(vCount);
		System.out.println(cCount);
	}


}

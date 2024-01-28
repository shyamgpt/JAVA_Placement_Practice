package string_topic;

import java.util.Scanner;

public class revereseEachWord {
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
	}
	
	
	public static String reverEachWord(String str) {
		String ans ="";
		for(int i =0; i<str.length(); i++) {
			
			int currentWordStart =0;
			String reverseWord = "";
			
			if(str.charAt(i) == ' ' ) {
				
				int currentWordEnd = i-1;
				 
                  for(int j =currentWordStart; j<currentWordEnd; j++ ) {
                	  reverseWord = str.charAt(j)+ reverseWord;
					
				}
                  ans +=reverseWord;
			
			}
//			return ans;
				
			
			
		}
		return ans;
	
	}
	
	public static void printString(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	



		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =inputString();

		String reverRes =reverEachWord(str);
		printString(reverRes);
		
		
		

	}

}

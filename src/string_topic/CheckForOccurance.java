package string_topic;

public class CheckForOccurance {
	
	
	public static int occuranceCheck(String str) {
		
		char ch = 'e';
		int count =0;
		for( int i =0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				count ++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Geekyants  is a my company";
		int res = occuranceCheck(str);
		System.out.println(res);
//		import java.util.Scanner;

	}

}

package Selenium_javaInterviewRealQuestion;

public class palindromeCheck {
	
	public static boolean isPalindrome(String str) {
	    StringBuilder sb = new StringBuilder(str);

	    // reverse the string
	    StringBuilder revseStr=  sb.reverse();
	   
System.out.println("str "+revseStr.toString());
	    // check if the reversed string is equal to the original string
	    return str.equals(revseStr.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jahaj";
	boolean res =	isPalindrome(str);
	System.out.println(res);

	}

}

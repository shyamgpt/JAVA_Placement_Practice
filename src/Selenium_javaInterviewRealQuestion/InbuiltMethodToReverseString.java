package Selenium_javaInterviewRealQuestion;

public class InbuiltMethodToReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String originalString = " Shyam Gupta";
//		StringBuilder revrseString = new StringBuilder();
//		
//		revrseString.append(originalString);
//		revrseString = revrseString.reverse();
//		System.out.println(originalString);
//		System.out.println(revrseString);
		
		
		String str = "shyam Gupta";
		StringBuilder sb = new StringBuilder(str);

	    // reverse the string
	   StringBuilder revseStr = sb.reverse();
	   System.out.println(revseStr);
	   
	   
	   
//	  String[] resStr = str.split(" ");
//	  System.out.println(resStr[0]);
//	  System.out.println(resStr[1]);
//	  String str1 = resStr[0];
//	  String str2 = resStr[1];
//	  
//	  String finalStr = str1.concat(str2);
//	  System.out.println(finalStr);

	}

}

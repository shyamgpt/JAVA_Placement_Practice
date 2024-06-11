package Selenium_javaInterviewRealQuestion;

//Ques -->convert mAdAm --> MadaM

public class StringUppToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "mADAm";
		String  x = "";
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				x = x+ Character.toLowerCase(ch);
			}
			else {
				x=x+Character.toUpperCase(ch);
			}
		}
		System.out.println(x);
	}

}

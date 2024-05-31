package Selenium_javaInterviewRealQuestion;

//Ques -->convert mAdAm --> MadaM

public class StringUppToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "mAdAm";
		str= str.toLowerCase();
		System.out.println(str);
		
		int firstTerm = str.charAt(0);
		int lastTerm = str.charAt(str.length()-1);
		
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == firstTerm && str.charAt(i)== lastTerm) {
				str
			}
		}
	}

}

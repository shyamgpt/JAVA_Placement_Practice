package Selenium_javaInterviewRealQuestion;

public class ToppleALternateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str  = "heelo every one";
		String  x = "";
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(i%2!=0) {
				x = x+ Character.toLowerCase(ch);
			}
			else {
				x=x+Character.toUpperCase(ch);
			}
		}
		System.out.println(x);
		//hEeLo eVeRy oNe

	}

}

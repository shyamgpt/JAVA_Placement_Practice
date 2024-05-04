package string_topic;

public class practice {
	
	
	public static void printPerm(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0,i)+ str.substring(i+1);
			printPerm(ros, ans+ch);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABC";
		printPerm(s, "");
		

	}

}

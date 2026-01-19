package string_topic;

public class Upper_Lower_case_Count_Method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "SoftwARE Tester";
		int upperCount = 0;
		int lowerCount =0;
		
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCount++;
			}else if(Character.isLowerCase(ch)) {
				lowerCount++;
			}
		}
		System.out.println(upperCount);
		System.out.println(lowerCount);
		

	}

}

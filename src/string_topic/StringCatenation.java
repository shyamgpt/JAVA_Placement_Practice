package string_topic;

public class StringCatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "coding";
		String str1 = " is fun";
		
//		str1 = str+str1;
//		str1 +=str;
//		System.out.println(str1);
		String str3 = str+str1;
		System.out.println(str3);
		
		str = str.concat(str1);
		
		System.out.println(str);
		
		System.out.println(str1.equals(str));

	}

}

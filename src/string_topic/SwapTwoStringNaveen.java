package string_topic;

public class SwapTwoStringNaveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swappig:");
		System.out.println("The value of a is: "+a);
		System.out.println("The valaue of b is: " +b);
		
		
		//1. Append a and b
		a= a+b;
		
		//2.Store initial string a in string b
		b = a.substring(0, a.length()-b.length());
		
		
		//3. Store initial string b in string a
		a = a.substring(b.length());
		
		System.out.println("after Swappig:");
		System.out.println("The value of a is: "+a);
		System.out.println("The valaue of b is: " +b);

	}

}

package string_topic;

public class SwapTwoStringNaveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Helloi";
		String b = "World";
		
		System.out.println("Before Swappig:");
		System.out.println("The value of a is: "+a);
		System.out.println("The valaue of b is: " +b);
		
		a= a+b;
		System.out.println(a.length());
		System.out.println(b.length());
		
		b = a.substring(0, a.length()-b.length());
		
		System.out.println(b.length());
		
		a = a.substring(b.length());
		
		System.out.println("after Swappig:");
		System.out.println("The value of a is: "+a);
		System.out.println("The valaue of b is: " +b);

	}

}

package string_topic;

public class swapTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swapping ");
		System.out.println("The value of a is ->"+a);
		System.out.println("The Value of b is " +b);
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		System.out.println("After Swapping ");
		System.out.println("The value of a is ->"+a);
		System.out.println("The Value of b is " +b);
		
		
		

	}

}

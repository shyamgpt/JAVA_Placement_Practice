 package randomQuestion;

public class swapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b =20;
//		System.out.pirntln();
		System.out.println("a is " +a + " and b is " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swaping , a is "+a+ " and b is " +b);

	}

}

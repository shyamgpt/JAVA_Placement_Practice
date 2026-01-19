package string_topic;

public class SwapToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;

		System.out.println("Number before swap" + " a is ->" + a +","+ " b is ->" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Number After swap" + " a is ->" + a + "," +" b is ->" + b);

	}

}

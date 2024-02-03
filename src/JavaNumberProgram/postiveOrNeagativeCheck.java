package JavaNumberProgram;

import java.util.Scanner;

public class postiveOrNeagativeCheck {
	
	public static void numberCheck(int num) {
		if(num<0) {
			System.out.println("Number is negative");
		} else if(num>0) {
			System.out.println("Number is postive");
		} else {
			System.out.println("Number is zero");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		numberCheck(num);

	}

}

package Number_Based_Question;

import java.util.Scanner;

public class factorialOfNumber {
	
	public static int findFactorial(int num) {
		
		int resfacto = 1;
		for(int i = num; i>0; i--) {
			System.out.println(i);
			resfacto = resfacto*i;
		}
		return resfacto;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int res = findFactorial( num);
        System.out.println(res);		


	}

}

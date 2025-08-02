package Number_Based_Question;

import java.util.Scanner;

public class factorialUsingRecursion {
	
	public static int FactRescursively(int num) {
		if(num ==0) {
			return 1;
		}
		else {
			return (num* FactRescursively(num-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		int res = FactRescursively(num);
		System.out.println(res);

	}

}

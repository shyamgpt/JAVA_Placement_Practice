package Duplicate_Code;

import java.util.Scanner;

public class greatesteOfFirstThree {
	
//	public static int findLargestNum(int n1, int n2, int n3) {
//		int temp = n1>n2?n1:n2;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int temp = n1>n2 ?n1:n2;
		int res =  n3>temp ?n3:temp;
		
		System.out.println("res->"+res);
		
	}

}

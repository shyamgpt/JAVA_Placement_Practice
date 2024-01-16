package Array_Placement;

import java.util.Scanner;

public class printArraySum {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Element of Array");
		for(int i =0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int arraySum(int[] arr) {
		int sum =0;
		for(int i =0; i<arr.length; i++) {
			sum = arr[i]+sum;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr =inputArray();
	int sum = arraySum(arr);
	System.out.println(sum);

	}

}

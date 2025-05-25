package Array_Placement;

import java.util.Scanner;

public class printArray {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = s.nextInt();
		int[] arr = new int[size]; 
		for(int i =0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void print_Array(int[] arr) {
		for(int i =0;i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = inputArray();
		print_Array(arr);
		

	}

}

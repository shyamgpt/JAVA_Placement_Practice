package Array_Placement;

import java.util.Scanner;

public class bubbleSort {
	
	public  static int[] inputArray() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the element of Array");
		for(int i =0; i<arr.length; i++) {
			 arr[i] = s.nextInt();
			
		}
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void printArray(int []arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = inputArray();
          printArray(arr1);
       int[] arr2 =   bubbleSort(arr1);
          printArray(arr2);
          
	}

}

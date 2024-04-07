package Array_Placement;

import java.util.Scanner;

public class findsmallestNum {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array Element");
		for(int i =0; i<arr.length; i++) {
			arr[i]= s.nextInt();
		}
		 return arr;
		
	}
	
	public static int smallestNum(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			
			for(int j =i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
			
			
		}
		return arr[0];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {11,2,5,6,1,3,2};
		
		int[] arr = inputArray();
		int res = smallestNum(arr);
		System.out.println(res);

	}

}

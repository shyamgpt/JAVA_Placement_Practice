package DailyPractice;

import java.util.Scanner;

public class Practice {
	
	public static int[] rotateArr(int[] arr, int n) {
		for(int i =0; i<n; i++) {
		int last = arr[arr.length-1];
		System.out.println(last);
		for(int j= arr.length-1; j>0; j--) {
			arr[j] = arr[j-1];
		}
		arr[0] = last;
			
		} 
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,6};
		int[] res =	rotateArr(arr, 2);
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
			
		
		
		
		
		
	
	
	
          
	}
}

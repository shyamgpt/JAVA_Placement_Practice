package Array_Placement;

import java.util.Scanner;

public class arrayRotation {

	public static int[] rotateArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int last;
			last = arr[arr.length - 1];

			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("For how many times you want to rotate the Array");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

//		int[] arrInput = {1,2,3,4,5};
		int[] arrInput = new int[] { 1, 2, 3, 4, 5 };

		printArray(arrInput);
		System.out.println();

		int[] res = rotateArray(arrInput, num);
		printArray(res);

	}

}

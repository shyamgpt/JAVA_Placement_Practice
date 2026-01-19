package Array_Placement;

public class findMaxElement {
	
	public static int findLargest(int[] arr) {
//		int max = Integer.MIN_VALUE;
		int max = arr[0];
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
		
	}	
	
	public static int findIndesOfMax(int[] arr, int max) {
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == max) {
				return i;
			}
		}
		return -1;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,11,1,4,90};
		int Max = findLargest(arr);
		System.out.println(Max);
		int index = findIndesOfMax(arr, Max);
		System.out.println("Max is present at index no-" + " "+ index);
	}

}

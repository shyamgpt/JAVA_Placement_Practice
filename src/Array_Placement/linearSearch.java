package Array_Placement;

public class linearSearch {
	
	public static int linearSearchAlgo(int[] arr, int elem) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == elem) {
				return i;
			}
			
		}
		return -1;
	}
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {5,6,2,7,9};
		int elem = 5;
		int res =linearSearchAlgo(arr, elem);
//		System.out.println(res);
		
		if(res == -1) {
			System.out.println("Element is not present in an array");
		}
		else {
			System.out.println("Element is present at index" + " "+res);
		}
		

	}

}

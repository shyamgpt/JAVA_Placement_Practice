package Array_Placement;

public class swapAlternate {
	
	public static int[] SwapAlt(int[] arr) {
		for(int i =0; i<arr.length-1;i=i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			
			
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
		
		int[] arr = {2,3,4,5,6,8,19,20};
		printArray(arr);
		System.out.println();
		int[] swapRes = SwapAlt(arr);
		
		printArray(swapRes);
		
//		for(int i =0; i<swapRes.length; i++) {
//			System.out.print(swapRes[i] + " ");
//		}

	}

}

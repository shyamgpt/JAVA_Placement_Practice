package youTube_Java_Program_2026;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		
		int[] arr = {2,1,4,5,6,9};
		
		int max = arr[0];
//		int secondMax = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int secondMax = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println("2nd max element is--> " +secondMax);

	}

}

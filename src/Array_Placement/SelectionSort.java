package Array_Placement;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i =0; i<n-1; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j =i; j<n; j++) {

				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
				
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] arr = {4,5,2,0,3,9};
		 selectionSort(arr);
		 for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+ " ");
		 }
		

	}

}

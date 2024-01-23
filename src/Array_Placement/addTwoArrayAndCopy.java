//Copy two independent array into one Array-->

package Array_Placement;

public class addTwoArrayAndCopy {
	
	public static int[] addArray(int[] arr1, int[] arr2) {
	int[] newArray = new int[arr1.length+arr2.length];
		
		for(int i =0;i<arr1.length;i++) {
			newArray[i] = arr1[i];
		}
		
		for(int j = 0; j<arr2.length; j++) {
			
			newArray[arr1.length+j] = arr2[j];
		}
		return newArray;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {3,5,6,7,8,10,24,90};
		int[] arr2 = {5,3,6,8,2};
		int[] finalArray = addArray(arr1, arr2);
		for(int i =0; i<finalArray.length; i++) {
			System.out.print(finalArray[i] +" ");
		}
		
	
		

	}

}

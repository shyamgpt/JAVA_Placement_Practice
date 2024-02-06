//problem--> merge two sorted Array

package Array_Placement;

public class mergeTwoSortedArray {
	
	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] sArr = new int[m+n];
		
		int i=0;
		int j =0;
		int k =0;
		
		while(i<m && j<n) {
			if(arr1[i]<= arr2[j]) {
				sArr[k]=arr1[i];
				i++;
				k++;
			}else {
				sArr[k]= arr2[j];
				j++;
				k++;
			}
			
		}
		while(i<m) {
			sArr[k]= arr1[i];
			i++;
			k++;
					
		}
		while(j<n) {
			sArr[k]= arr2[j];
			j++;
			k++;
		}
		return sArr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {0,1,2,4,8,10,13,15};
		int[] arr2 = {2,3,5,7,9};
		int[] sortedArr =mergeArray(arr1, arr2);
		for(int i =0;i<sortedArr.length; i++) {
			System.out.print(sortedArr[i]+" ");
			
		}
		

	}

}

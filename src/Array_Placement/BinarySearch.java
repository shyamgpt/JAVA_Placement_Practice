package Array_Placement;

public class BinarySearch {
	
	public static int binarySrch1(int[] arr, int elem) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid] > elem) {
				e = mid-1;
			}else if(arr[mid] < elem) {
				s = mid+1;
				
			}else {
				return mid;
			}
		 
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,7,8,9};
		int elem = 9;
		int res = binarySrch1(arr, elem);
		System.out.println(res);
		if(res == -1) {
			System.out.println("Element is not present");
			
		}else {
			System.out.println("Element is present at index"+ " " + res);
		}

	}

}

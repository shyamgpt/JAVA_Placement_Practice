package Array_Placement;

public class FindMinValueInArray {

	public static int findMinValue(int[] arr) {
//		int min = Integer.MAX_VALUE;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int minValueIndex(int[] arr, int min) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={2,3,4,1,-2,6};
        int res = findMinValue(arr);
        System.out.println("Min Value of Array is --> " +res);
        int index = minValueIndex(arr, res);
        System.out.println("Index of Min value is-> "+index);

	}

}

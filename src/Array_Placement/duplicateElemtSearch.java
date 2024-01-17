package Array_Placement;

public class duplicateElemtSearch {
	
	public static void dupicateSearch(int[] arr) {
		
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1 ; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				
				} 
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,2,3,4,4,5, 8,8,19, 20, 20};
		dupicateSearch(arr);

	}

}

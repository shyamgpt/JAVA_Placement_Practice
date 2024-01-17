package Array_Placement;

public class reverseArray {
	
	public static int[] revrArray(int[] input) {
		int length = input.length;
		for(int i=0; i<length/2; i++) {
			
			int temp = input[i];

			input[i] = input[length-i-1];
		
			input[length-i-1] = temp;
	
		}
		return input;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr = {1,2,3,4,5};
          
     int[] res =    revrArray(arr);
     for(int j=0; j<res.length;j++) {
			System.out.println(res[j]);
     }

}
}

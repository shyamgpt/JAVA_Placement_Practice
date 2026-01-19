package youTube_Java_Program_2026;

public class missing_number_in_array {
	
	public static int missing_element() {
		int[] arr = {54,55,56,57,58,59,60};
		for(int i =0; i<arr.length-1; i++) {
			
				if(arr[i]+1 != arr[i+1] ) {
					return arr[i]+1;
				
			}
		} return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = missing_element();
		if(res ==-1) {
			System.out.println("number not is missing");
			
		} else {
			System.out.println("missing no is -->" +res);
		}
		
		

	}

}

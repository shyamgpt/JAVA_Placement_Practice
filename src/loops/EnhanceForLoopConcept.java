package loops;

public class EnhanceForLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int k : arr) {
			System.out.println(k);
		}

	}

}

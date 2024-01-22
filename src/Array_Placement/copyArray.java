package Array_Placement;

public class copyArray {
	
	

	public static void main(String[] args) {
		
		int [] arr = new int[] {2,5,1,7,9};
		
		int[] newArray = new int[arr.length];
		
		for(int i =0; i<arr.length; i++) {
			newArray[i] = arr[i];
			
			System.out.println(newArray[i]);
		}
		
		

}
}

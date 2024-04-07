package Array_Placement;

public class printOddAndEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,2,5,6,7,9};
		
		System.out.println("Print the odd numbers");
		
		for(int i =0; i<arr.length; i++) {
			
			if(arr[i]%2 != 0) {
				
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Print the even numbers");
		for(int j =0; j<arr.length; j++) {
			if(arr[j]%2 ==0) {
				System.out.println(arr[j]);
			}
		}
		

	}

}

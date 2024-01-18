//Problem statement ->
//How do you find all pairs of an integer array whose sum is equal to a given number
package Array_Placement;

public class integerPairInArray {
	
	public static void printPairSum(int[] input, int sum) {

		int length = input.length;
		for(int i =0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(input[i]+input[j] == sum) {
					System.out.println("index where elemnt is present -> "+i+ ","+j);
					System.out.println("pairs of element-> "+"("+input[i]+","+input[j]+")");
					
					
				}
			}
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,0,6,-3,9,8,12};
		printPairSum(arr,9);
		
		
		

	}

}

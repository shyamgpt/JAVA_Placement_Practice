 package Selenium_javaInterviewRealQuestion;
// https://www.geeksforgeeks.org/java-program-to-remove-duplicate-elements-from-the-array/
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicatesInArray {
	
	public static HashSet<Integer> removeDuplicates(int[] arr) {
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,2,4,4,3,3,9,9};
		int[] arr2 = {5,5,6,6,7,7};
		HashSet<Integer> res1 = removeDuplicates(arr1);
		HashSet<Integer> res2 = removeDuplicates(arr2);
		System.out.println(res1);
		System.out.println(res2);
		res1.addAll(res2);
		System.out.println(res1);
		

	}

}

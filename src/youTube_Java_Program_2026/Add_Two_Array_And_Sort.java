package youTube_Java_Program_2026;
/*
 * input-->
 * int[] arr1 = {1, 3, 7, 8, 11}; 
 * int[] arr2 = {2, 6, 9, 11};
 * 
 * output-->[1, 2, 3, 6, 7, 8, 9, 11]
 * 
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Add_Two_Array_And_Sort {

	
	public static HashSet<Integer> addTwoArray(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i =0; i<arr.length; i++) {
			hs.add(arr[i]);
			
		}
		return hs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 3, 7, 8, 11}; 
		int[] arr2 = {2, 6, 9, 11};
		HashSet<Integer>res1 =addTwoArray(arr1);
		HashSet<Integer>res2 =addTwoArray(arr2);
		res1.addAll(res2);
		System.out.println(res1); // this will print the hashSet
		
//		List<Integer> list = new ArrayList<>(res1);
		ArrayList<Integer> list = new ArrayList<>(res1);
		Collections.sort(list);
		System.out.println(list);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Method-2-->
	 * import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 7, 8, 11};
        int[] arr2 = {2, 6, 9, 11};

        // Use Set to remove duplicates
        Set<Integer> set = new HashSet<>();

        // Add elements of first array
        for (int num : arr1) {
            set.add(num);
        }

        // Add elements of second array
        for (int num : arr2) {
            set.add(num);
        }

        // Convert set to list for sorting
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}

	 * 
	 * 
	 * 
	 * */

}

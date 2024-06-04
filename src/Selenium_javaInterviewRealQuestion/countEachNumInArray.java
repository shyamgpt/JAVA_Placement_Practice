package Selenium_javaInterviewRealQuestion;

import java.util.HashMap;

public class countEachNumInArray {
	
	
	public static void getCharCount(int []arr) {
		HashMap<Integer, Integer> charMap = new HashMap<Integer,Integer>();
//		char[] strArray = name.toCharArray();
		for(int c : arr) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println("+arr+"+ ":"+charMap);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,4,2};
		getCharCount(arr);

	}

}

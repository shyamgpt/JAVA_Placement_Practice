package Duplicate_Code;

import java.util.HashMap;

public class countEachCharacterInString {
	
	
	public static void getCharCount(String name) {
		HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
		char[] strArray = name.toCharArray();
		for(char c : strArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(name+ ":"+charMap);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getCharCount("Shyamm");

	}

}

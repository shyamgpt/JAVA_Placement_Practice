package string_topic;

import java.util.HashMap;
import java.util.Set;

public class printDuplicateLettersUsingHashMap {

	public static void main(String[] args) {
		String str = "Welcome to Sapient";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') { // Ignore spaces
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}

		System.out.println("Duplicate letters:");

		Set<Character> keys = map.keySet();
		for (char ch : keys) {
			if (map.get(ch) > 1) {
				System.out.println(ch + " : " + map.get(ch));

			}
			/*
			 * for (char ch : map.keySet()) { 
			 * if (map.get(ch) > 1) { 
			 * System.out.println(ch +" : " + map.get(ch));
			 * 
			 * 
			 * 
			 * 
			 * }
			 * 
			 */
		}
	}

}

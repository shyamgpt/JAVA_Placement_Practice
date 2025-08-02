package string_topic;

import java.util.HashMap;

public class printDuplicateLettersUsingHashMap {
	
	 public static void main(String[] args) {
	        String test = "Welcome to Sapient";
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	        for (int i = 0; i < test.length(); i++) {
	            char ch = test.charAt(i);
	            if (ch != ' ') { // Ignore spaces
	                if (map.containsKey(ch)) {
	                    map.put(ch, map.get(ch) + 1);
	                } else {
	                    map.put(ch, 1);
	                }
	            }
	        }

	        System.out.println("Duplicate letters:");
	        for (char ch : map.keySet()) {
	            if (map.get(ch) > 1) {
	                System.out.println(ch + " : " + map.get(ch));
	            }
	        }
	    }

}

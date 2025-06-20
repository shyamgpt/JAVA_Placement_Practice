package string_topic;

public class AnagramCheckSoln {
	
	
	public static boolean AnaGramCheck(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() == str2.length()) {
			for(int i =0 ; i<str1.length(); i++) {
				for(int j =0; j<str2.length(); j++) {
					if(str1.charAt(i) == str2.charAt(j)) {
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return true;
//		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "lives";
		String str2 = "elvis";
		boolean res = AnaGramCheck(str1, str2);
		System.out.println(res);

	}
	
	/*
	 * 
	 * 
	 * 
	 * import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arraysume.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(str1 + " and " + str2 + " are anagrams: " + areAnagrams(str1, str2)); // Output: true

        str1 = "hello";
        str2 = "world";
        System.out.println(str1 + " and " + str2 + " are anagrams: " + areAnagrams(str1, str2)); // Output: false
    }
}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}

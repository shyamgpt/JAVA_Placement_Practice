package youTube_Java_Program_2026;

//WAP to print the length of last word of String

public class SecondWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world";
		
//		String[] words = str.split("\\s+");
		String[] words = str.split(" ");
		
		if(words.length >= 2) {
			System.out.println(words[1].length());
		}
		for(int i =0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		

	}
	
	/*
	 * Aliter-- without using split
	 * public class Main {
    public static void main(String[] args) {

        String str = "Shyam Guptaaa";
        int count = 0;
        int wordIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordIndex++;
            } else if (wordIndex == 1) {
                count++;
            }
        }

        System.out.println("Length of 2nd word: " + count);
    }
}

	 * 
	 * */

}

package string_topic;

public class SwapToWord {
	
	// Function to swap the first and last words of the sentence
    public static String swapFirstAndLastWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Ensure there are at least two words in the sentence before swapping
        if (words.length >= 2) {
            // Swap the first and last words without using a third variable
            words[0] = words[0] + words[words.length - 1];
            words[words.length - 1] = words[0].substring(0, words[0].length() - words[words.length - 1].length());
            words[0] = words[0].substring(words[words.length - 1].length());
            
            // Construct the swapped sentence
            StringBuilder swappedSentence = new StringBuilder();
            for (String word : words) {
                swappedSentence.append(word).append(" ");
            }
            
            return swappedSentence.toString().trim();
        } else {
            // If there are fewer than two words in the sentence, return the original sentence
            return sentence;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String sentence = "Good Morning";
        
        // Call the function to swap the first and last words
        String swappedSentence = swapFirstAndLastWords(sentence);
        
        // Print the swapped sentence
        System.out.println("String before swapping: " + sentence);
        System.out.println("String after swapping: " + swappedSentence);

	}

}

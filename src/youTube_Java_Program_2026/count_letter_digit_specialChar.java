package youTube_Java_Program_2026;

public class count_letter_digit_specialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A4B3C6D7E57&4%U";
        int alphabets = 0, digits = 0, specialChars = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }

        System.out.println("Alphabets = " + alphabets);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + specialChars);

	}

}

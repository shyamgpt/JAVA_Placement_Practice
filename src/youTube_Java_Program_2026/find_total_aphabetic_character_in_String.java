package youTube_Java_Program_2026;

public class find_total_aphabetic_character_in_String {
	
	
	public static int findSum() {
		String str = "A4B3C6D7E57&4%U";
		int count =0;
		for(int i =0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = findSum();
		System.out.println(res);

	}

}

package youTube_Java_Program_2026;

public class find_Sum_of_number_in_String {
	
	
	public static int findSum() {
		String str = "A4B3C6D7E57&4%U";
		int sum =0;
		for(int i =0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
		}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = findSum();
		System.out.println(res);

	}

}

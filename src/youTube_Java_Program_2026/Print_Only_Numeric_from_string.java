package youTube_Java_Program_2026;

public class Print_Only_Numeric_from_string {
	
	public static void print_Num_In_Nextline() {
		String str = "ABCG123EFJ5678NM2000";
		String num = "";
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				num = num +ch;
			} else if(!num.isEmpty()) {
				System.out.println(num);
				num="";
			}
			
		}
		if(!num.isEmpty()) {
			System.out.println(num);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_Num_In_Nextline();
		
		

	}
	
	/*
	 * 
	 * 
	 * public class Main {
    public static void main(String[] args) {

        String str = "ABCD12EFCG1234HJUI12000";
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num + ch;
            } else {
                if (!num.equals("")) {
                    System.out.println(num);
                    num = "";
                }
            }
        }

        // print last number
        if (!num.equals("")) {
            System.out.println(num);
        }
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
	 * */

}

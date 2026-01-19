package youTube_Java_Program_2026;

public class reverse_only_letters {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "a1b2c3";
		 //a1b2, 1ab2
	        char[] ch = str.toCharArray();

	        int i = 0;
	        int j = ch.length - 1;

	        while (i < j) {

	            if (!Character.isLetter(ch[i])) {
	                i++;
	            } 
	            else if (!Character.isLetter(ch[j])) {
	                j--;
	            } 
	            else {
	                char temp = ch[i];
	                ch[i] = ch[j];
	                ch[j] = temp;
	                i++;
	                j--;
	            }
	        }

	        System.out.println(new String(ch));
	}

}

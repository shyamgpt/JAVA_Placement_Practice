package youTube_Java_Program_2026;

public class Reverse_String_word_wise {

	//Shyam Gupta → mayhS atpuG
	public static void revWord(){
        String str = "Software testing";
        String[] words = str.split(" ");
        String revWord="";
        for(String word : words){
            String rev ="";
            for(int i =0; i<word.length(); i++){
                rev = word.charAt(i)+rev;
            }
            
            revWord= revWord+rev+" ";
          
            
        }
            System.out.println(revWord);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Try programiz.pro");
	        revWord();
	    

	}
	
	/*
	 * mayhS atpuG

	 * 
	 * lass Main {
    public static void main(String[] args) {
        String str = "Shyam Gupta";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
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
	 * */

}

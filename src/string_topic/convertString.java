package string_topic;

public class convertString {
	
public static String convrtString(String str){
        
        StringBuilder output = new StringBuilder();
        
        for(int i =0; i<str.length(); i=i+2){
            char letter = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i+1));
            for(int j =0;j<count; j++){
                output.append(letter);
            }
        }
        return output.toString();
        
    }
    public static void main(String[] args) {
        String str = "A1B2C3";
        String res = convrtString(str);
        System.out.println(res);
        
    }

}

package string_topic;

public class pritnAllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pqrs";
		for(int i=0; i<str.length(); i++) {
			for(int j =i; j<=str.length(); j++) {
				System.out.print(str.substring(i,j)+" ");	
			}
		}


	}

}

package string_topic;

public class pritnAllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pqrs";
		System.out.println(str.length());
		for(int i=0; i<str.length(); i++) {
			for(int j =i+1; j<=str.length(); j++) {
				System.out.print(str.substring(i,j)+" ");	
			}
		}


	}

}

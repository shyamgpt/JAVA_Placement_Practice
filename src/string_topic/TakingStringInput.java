package string_topic;

import java.util.Scanner;

public class TakingStringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string Input");
//		str =s.next();
		str =s.nextLine();
		System.out.println("Input String is--> " +str);
		System.out.println("String lenght is -->" +str.length());

	}

}

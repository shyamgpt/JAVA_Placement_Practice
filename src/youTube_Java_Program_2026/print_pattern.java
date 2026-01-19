package youTube_Java_Program_2026;

//*
//@@
//***
//@@@
//*****
public class print_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		for(int i=0;i<n; i++) {
			for(int j =0; j<=i; j++) {
				
				if(i%2==1) {
					System.out.print("@");
				}else {
					System.out.print("*");
				}
				
				
			}
			System.out.println();
		}

	}

}

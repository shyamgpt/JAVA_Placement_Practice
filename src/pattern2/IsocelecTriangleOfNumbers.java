package pattern2;

import java.util.Scanner;

public class IsocelecTriangleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			int space =1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int num =1;
			int j =i;
			while(num<=i) {
				System.out.print(j);
				j++;
				num++;
			}
			
			int revNum = i-1;
			
			int numR = revNum+i-1;
			
			while(revNum>=1) {
				System.out.print(numR);
			   
				revNum--;
				numR--;
				 
				
			}

			System.out.println();
			i++;
		}

	}

}

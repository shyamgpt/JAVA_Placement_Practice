package Selenium_javaInterviewRealQuestion;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =10;
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm;
		System.out.println("Fibbonaci series till " + n + " terms:");
		
		for(int i =0; i<n; i++) {
			System.out.print(firstTerm+ ",");
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			
			secondTerm = nextTerm;
		}

	}

}

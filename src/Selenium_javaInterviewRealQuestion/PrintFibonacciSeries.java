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
	
	/*
	 * class Main {
    public static void main(String[] args) {

        int n = 7;   // position of Fibonacci number
        int firstTerm = 1;
        int secondTerm = 2;
        int nextTerm = 0;

        if (n == 1) {
            System.out.println(firstTerm);
            return;
        }

        for (int i = 3; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("7th Fibonacci number is: " + secondTerm);
    }
}
	 * */

}

package Selenium_javaInterviewRealQuestion;

public class printOddPrimeNumber {
	
	public static boolean isOdd(int num){
        if(num%2 == 0){
            return false;
        }
        return true;
    }
    
    public static boolean isPrime(int num){
        
        if(num == 0 || num == 1){
            return false;
        }
        for(int i =2; i<num; i++){
            if(num%i == 0){
                return false;
            }
            
        }
        return true;
        
    }
    public static void main(String[] args) {
        int num = 0;
        int count = 10;
        for(int i =0; i<count ; i++){
            if(isPrime(num) && isOdd(num)){
                System.out.println(num);
            }
            num++;
        }
       
        // boolean res = isPrime(num);
        // System.out.println(res);
        
    }

}

package randomQuestion;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1;
 
        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
            int rand1 = (int) Math.floor( Math.random() );
           
            // Output is different everytime this code is executed
            System.out.print(rand + " ");
            System.out.print(" -> "  );
            System.out.print(rand1 + " "+ ", ");
        }

	}

}

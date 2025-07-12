package Notes_2025_June;

public class Expection_Handling_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Ques --when to use try-catch and when to use throws and throw?
	 * 
	 * In Java, try-catch, throws, and throw are used for exception handling, but
	 * they serve different purposes. Here's a clear breakdown:
	 * 
	 * 
	 * 1--> try-catch -- Handling exceptions ==>
	 * 
	 * Def-->
	 * Use try-catch when you want to handle an exception directly in the method.
	 * 
	 * Syntax-->
	 * try { // code that might throw an exception } catch (ExceptionType e) {
	 * //handle the exception }
	 * 
	 * Example--> try { int result = 10 / 0; // ArithmeticException } catch
	 * (ArithmeticException e) { System.out.println("Cannot divide by zero!"); }
	 * 
	 * 
	 * 
	 * 2--> throws--> Declaring excptions
	 * 
	 * Def-->
	 * Use throws when you don't want to handle the exception in the current method
	 * and instead pass it to the calling method.
	 * 
	 * Syntax-->
	 * 
	 * public void myMethod() throws IOException {
	 * // code that might throw IOException
	 * }
	 * 
	 * Example-->
	 * public void readFile() throws IOException {
	 *  FileReader fr = new FileReader("file.txt");
	 * }
	 * 
	 * 
	 * 3-->throw  --> throwing an exception manually
	 * 
	 * Def-->
	 * Use throw when you want to throw an exception explicitly (manually).
	 * 
	 * syntax-->
	 * 
	 * throw new ExceptionType("Error message");
	 * 
	 * Example-->
	 * if (age < 18) {
	 *  throw new IllegalArgumentException("Age must be 18 or older.");
	 * }
	 * 
	 * 
	 *  When to Use What?--->
	 * | Use Case                                               | Use         |
| ------------------------------------------------------ | ----------- |
| You want to **handle** the error in the same method    | `try-catch` |
| You want to **pass the responsibility** to the caller  | `throws`    |
| You want to **manually create and throw** an exception | `throw`     |

	 * 
	 * 
	 */
	
	
	/*Combined Example-->
	 * public void validate(int age) throws IllegalArgumentException {
	 *    if (age < 18) {
	 * throw new IllegalArgumentException("Not eligible");
	 *    }
	 * }
	 * 
	 * public void process() {
	 * try {
	 *      validate(15);
	 * } catch (IllegalArgumentException e) {
	 * 
	 * System.out.println("Error: " + e.getMessage());
	 *      } 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	
	
	
	
	
	
}

package Notes_2025_June;

public class Interface_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * Ques - It is mandatory to implement all the methods declared in that
	 * interface?
	 * 
	 * Ans--> Yes, in Java, if a class implements an interface, then: It is
	 * mandatory to implement all the methods declared in that interface, unless the
	 * class is declared as abstract.
	 * 
	 * Detailed Explanation:-->
	 * 
	 * Example-->
	 * 
	 * interface MyInterface { 
	 * void method1(); 
	 * void method2(); 
	 * void method3(); 
	 * }
	 * 
	 * 
	 * If you implement this interface in a class:-->
	 * 
	 * class MyClass implements MyInterface { 
	 * public void method1() {
	 * System.out.println("method1 implemented"); 
	 * }
	 * 
	 * public void method2() { 
	 * System.out.println("method2 implemented"); 
	 * }
	 * 
	 * public void method3() {
	 *  System.out.println("method3 implemented"); 
	 *  } 
	 *  }
	 * 
	 * 
	 * 
	 * Exception: abstract class--> If the class is declared as abstract, then it is
	 * allowed to skip implementing some or all methods:
	 * 
	 * abstract class MyAbstractClass implements MyInterface { 
	 * public void method1() { 
	 *
	 * 
	 * System.out.println("method1 implemented"); 
	 * }
	 * 
	 * // method2() and method3() are not implemented here 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

package OopsConcept;
//Url-->https://www.geeksforgeeks.org/java/abstraction-in-java-2/
/*
 * Abstraction in Java is the process of hiding internal implementation details 
 * and showing only essential functionality to the user. 
 * It focuses on what an object does rather than how it does it.
 
 * Abstraction hides the complex details and shows only essential features.
 * 
 * Main Def-->
 * 
 *(hiding the internal implementation details and showing only essential functionality 
 *to the user)
 
 * How to Achieve Abstraction in Java?
Java provides two ways to implement abstraction, which are listed below:

Abstract Classes (Partial Abstraction)
Interface (100% Abstraction)
 * */




public class Abstraction_class {
	// Working of Abstraction in Java
	abstract class Geeks {
	    abstract void turnOn();
	    abstract void turnOff();
	}

	// Concrete class implementing the abstract methods
	class TVRemote extends Geeks {
	    @Override
	    void turnOn() {
	        System.out.println("TV is turned ON.");
	    }

	    @Override
	    void turnOff() {
	        System.out.println("TV is turned OFF.");
	    }
	}

	// Main class to demonstrate abstraction
	public class Main {
	    public static void main(String[] args) {
	        Geeks remote = new TVRemote();
	        remote.turnOn();   
	        remote.turnOff();  
	    }
	}

}

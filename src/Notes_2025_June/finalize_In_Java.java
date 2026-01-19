package Notes_2025_June;

public class finalize_In_Java {
	/*
	 * 
	 * In Java, finalize() is a method defined in the Object class. It was used as a
	 * mechanism to allow an object to clean up resources (like closing files or
	 * releasing memory) before it is garbage collected.
	 * 
	 * (Main Theory-->
	 * In Java, finalize() is a method of the Object class that the Garbage Collector (GC)
	 * used to call before destroying an object.
	 * 
	 * How it Works:--> When an object becomes eligible for garbage collection, the
	 * JVM calls its finalize() method just before destroying the object.
	 * )
	 * 
	 * Example--> 
	 * protected void finalize() throws Throwable { // cleanup code
	 * super.finalize(); // optional, but recommended
	 *  }
	 * 
	 * How it Works:--> When an object becomes eligible for garbage collection, the
	 * JVM calls its finalize() method just before destroying the object.
	 * 
	 * You can override this method in your class to write custom cleanup code.
	 * 
	 * public class MyClass {
	 * @Override
	 * protected void finalize() throws Throwable {
	 * System.out.println("Finalize method called!");
	 * // cleanup logic here
	 * super.finalize();
	 *      }
	 * }
	 * 
	 * If an object of MyClass is garbage collected, this message will be printed.
	 * 
	 *  Important Notes:-->
	 * The finalize() method is deprecated since Java 9 and removed in Java 18.
	 * It’s not reliable for resource cleanup because:
	 * There’s no guarantee when or even if it will be called.
	 * It can cause performance issues and resource leaks.
	 * 
	 * 
	 */
}

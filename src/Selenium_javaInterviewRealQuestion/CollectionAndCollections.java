package Selenium_javaInterviewRealQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// URL --> https://www.geeksforgeeks.org/collection-vs-collections-in-java-with-example/
public class CollectionAndCollections {

	/*
	 * Collection: -->  It is an interface. 
	 *  It is used to represent a group of individual objects as a single unit.
	 *  The Collection is an interface that contains a static method since java8. The
	 *  Interface can also contain abstract and default methods. 
	 * 
	 * Collections: ->
	 * It is a utility class.
	 * It defines several utility methods that are used to operate on collection
	 * It contains only static methods.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> arrlist = new ArrayList<String>(); 
	       
	      // Adding elements to arrlist
	      arrlist.add("geeks");
	      arrlist.add("for");
	      arrlist.add("geeks");
	       
	      // Printing the elements of arrlist
	      // before operations
	      System.out.println("Elements of arrlist before the operations:");
	      System.out.println(arrlist);
	       
	      System.out.println("Elements of arrlist after the operations:");
	       
	      // Adding all the specified elements
	      // to the specified collection
	      Collections.addAll(arrlist, "web", "site");
	       
	      // Printing the arrlist after
	      // performing addAll() method
	      System.out.println(arrlist);
	       
	      // Sorting all the elements of the  
	      // specified collection according to 
	      // default sorting order
	      Collections.sort(arrlist);
	         
	      // Printing the arrlist after
	      // performing sort() method
	      System.out.println(arrlist);
	         

	}

}

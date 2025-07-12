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
	
	/*
	 *        Collection (interface)
          /       |       \
       List      Set     Queue   ← all are subinterfaces
        |         |        |
 ArrayList   HashSet   LinkedList (examples)

	 * 
	 * 
	 * Collection(Singluar) Interface-->
	 * 
	 * It is an interface.

It represents a group of objects (like List, Set, etc.)

You can use its methods like add(), remove(), etc.
	 * 
	 * 
	 * Eg of collection-->
	 * import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        System.out.println(items); // [Apple, Banana]
    }
}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	/* Collections-->
	 * 
	 *  2. Collections (Plural) — Utility Class
It is a class (not an interface).

It contains static helper methods to work with collections.

Methods like: sort(), reverse(), min(), max(), shuffle(), etc.
	 * 
	 * 
	 * import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");

        Collections.sort(fruits); // Sorts the list
        System.out.println(fruits); // [Apple, Banana, Orange]
    }
}

	 * 
	 * 
	 * | Feature       | `Collection`                 | `Collections`                                 |
| ------------- | ---------------------------- | --------------------------------------------- |
| What is it?   | Interface                    | Utility class                                 |
| Type          | `interface`                  | `final class`                                 |
| Package       | `java.util.Collection`       | `java.util.Collections`                       |
| Usage         | To create data structures    | To perform operations on them                 |
| Example Class | `ArrayList`, `HashSet`, etc. | `Collections.sort()`, `Collections.reverse()` |

	 * 
	 * 
	 * 
	 * 
	 * 
	 * Important method of collection -->
	 * 
	 * | Method       | Description                    |
| ------------ | ------------------------------ |
| `add()`      | Adds an element                |
| `remove()`   | Removes an element             |
| `clear()`    | Removes all elements           |
| `size()`     | Returns the number of elements |
| `isEmpty()`  | Checks if collection is empty  |
| `contains()` | Checks if element exists       |
| `iterator()` | Returns an iterator to loop    |

	 * 
	 * 
	 * 
	 */

}

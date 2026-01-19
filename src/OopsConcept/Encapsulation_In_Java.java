package OopsConcept;

//Url-->https://www.geeksforgeeks.org/java/encapsulation-in-java/
/*Notes-->
 * In Java, encapsulation-->
 *  in which we bind the data members and methods into a single unit. Encapsulation is 
 *  used to hide the implementation part and show the functionality for 
 *  better readability and usability.
 * 
 * 
 * getter and setter: getter (display the data) and setter method ( modify the data) 
 * ->are used to provide the functionality to access and modify the data, 
 * and the implementation of this method is hidden from the user. 
 * The user can use this method, but cannot access the data directly.
 * 
 * (binding the data and method into a single unit and and provide getter abd setter to access and modify the data)
 * 
 * */
public class Encapsulation_In_Java {
	// Java program demonstrating Encapsulation
	class Programmer {

		private String name;

		// Getter and Setter for name
		
	// Setter method is used to set or modify the data
		public void setName(String name) {
			this.name = name;
		}
		// Getter method used to get the data
				public String getName() {
					return name;
				}
	}

	public class Geeks {

		public static void main(String[] args) {
			Programmer p = new Programmer();
			p.setName("Geek");
			System.out.println("Name=> " + p.getName());
		}
	}

}

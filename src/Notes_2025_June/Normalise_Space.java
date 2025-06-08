package Notes_2025_June;

public class Normalise_Space {
	/*
	 * what is Normalise_Space?
	 * 
	 * The normalize-space function removes leading and trailing white-space from a
	 * string, replaces sequences of whitespace characters by a single space, and
	 * returns the resulting string.
	 * 
	 * 
	 * Eg-->
	 * 
	 * <div>
	 * 
	 * <button>Click   me </button>
	 * 
	 * 
	 * </div>
	 * 
	 * 
	 * There is 3 space between Click and Me and these 3 space are know as normalise space and space can be more also
	 * like 20..... 50 etc spaces
	 * 
	 * 
	 * Now the xpath for click me-->
	 *  //button[text()='click me']  - It's wrong xpath becoz these is 3 space between click and me and ideally it should be 1
	 *  
	 *  Correct xpath for normalise space -->
	 *  //button[normalise-space(text()='Click me')]
	 * 
	 */
}

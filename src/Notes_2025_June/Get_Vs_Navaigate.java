package Notes_2025_June;

public class Get_Vs_Navaigate {
	/*
	 * Ques--> Difference between driver.get() and Navigate() in Selenium?
	 * 
	 * In Selenium WebDriver, both driver.get() and driver.navigate().to() are used
	 * to open a webpage, but there are some key differences between the two.
	 * 
	 * 
	 * 1. driver.get(String url)--->
	 * 
	 * -Simpler and direct method to open a URL. 
	 * -It waits until the entire page is loaded.
	 * -Does not allow navigating back/forward in history.
	 * -Cannot be used for refresh or back/forward actions.
	 * 
	 * 
	 * Example: driver.get("https://www.google.com");
	 * 
	 * 
	 * 2. driver.navigate().to(String url) More flexible and advanced than get().
	 *-Internally it behaves almost the same as get(), but it belongs to the
	 * Navigation interface.
	 *-Allows back, forward, and refresh operations using:
	 * navigate().back()
	 * navigate().forward()
	 * navigate().refresh()
	 * 
	 * 
	 *  Example:
	 * driver.navigate().to("https://www.google.com");
	 * driver.navigate().back();
	 * driver.navigate().forward();
	 * driver.navigate().refresh();
	 * 
	 * ⚖️ Summary Table:
Feature                      	driver.get()	driver.navigate().to()
Used to open a URL	             ✅ Yes         	✅ Yes
Waits for full page load	     ✅ Yes	            ✅ Yes
Supports back/forward/refresh	 ❌ No	            ✅ Yes
Simpler syntax                   ✅ Yes	            ❌ Slightly more verbose
Interface	                     WebDriver	         Navigation
	 * 
	 * 
	 * 
	 */
}

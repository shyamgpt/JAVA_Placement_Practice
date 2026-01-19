package Notes_2025_June;

public class Close_Vs_Quit {
	
	/*
	 * Interview-Perfect Answer

“close() closes the current browser window, while quit() closes all browser windows and terminates the WebDriver session.”
	 * 
	 * 
	 * */
	
	/*
	 * 🚪 driver.close()
	 * 
	 * Closes only the current browser window
	 * 
	 * WebDriver session remains active
	 * 
	 * Other open windows/tabs stay open
	 * 
	 * 📌 Used when:
	 * 
	 * You want to close a single tab/window
	 * 
	 * Handling multiple windows
	 */

	/*
	 * driver.quit()
	 * 
	 * Closes all browser windows
	 * 
	 * Ends the WebDriver session completely
	 * 
	 * Kills the browser + driver instance
	 * 
	 * 📌 Used when:
	 * 
	 * Test execution is finished
	 * 
	 * Cleanup is required
	 */

	/*
	 * 
	 * driver.get("https://example.com"); 
	 * driver.executeScript("window.open()");
	 * 
	 */
	
	/*
	 * Method	Result
driver.close()	Closes current tab only
driver.quit()	Closes all tabs & browser
	 * 
	 * */

}

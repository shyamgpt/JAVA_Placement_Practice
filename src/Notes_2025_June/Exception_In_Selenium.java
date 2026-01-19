package Notes_2025_June;

public class Exception_In_Selenium {

	//Url--> https://www.browserstack.com/guide/exceptions-in-selenium-webdriver
	//https://testquality.com/different-types-of-selenium-webdriver-common-exceptions/
	
	
	/* 1. NoSuchElementException
	 * 2. NoSuchWindowException
	 * 3. NoSuchFrameException
	 * 4. NoAlertPresentException
	 * 5. StaleElementReferenceException
	 * 6. SessionNotFoundException
	 * 7. TimeOutException
	 * 
	 * 8. WebDriverException
	 * 9. ElementNotSelectableException
	 * 
	 * 
	 * 
	 * Deprecated in Selenium-4-->
	 * 1.ElementNotVisibleException --> Use ElementNotInteractableException instead.
	 * 2.InvalidElementStateException--> Merged under ElementNotInteractableException.
	 * 
	 * 
	 * 
	 * 1. NoSuchElementException-->
	 * This exception occurs when the locators (i.e. id / xpath / css selectors, etc.) we mentioned in the Selenium Program 
	 * code are unable to find the web element on the web page. There are two possibilities for getting this exception: 
	 * either we have provided an incorrect locator and are trying to find the web element, or we have provided the correct locator,
	 * but the web element related to the locator is not available on the web page.
	 * 
	 * 
	 * 2. NoSuchFrameException-->
	 * iframe is an HTML web page inside another HTML web page. To work with the Web Elements on any iframe, 
	 * we have to first switch to the iframe in Selenium and then locate the respective web elements inside the iframe. 
	 * NoSuchFrameException WebDriver Exception occurs when the driver in the Selenium Program code is unable to find the 
	 * frame on the web page to switch to. i.e., when the driver is switching to an invalid or non-existent iframe.
	 * 
	 * 3. NoSuchwindowException-->
	 * As Selenium only automates Web Applications, we will be mostly dealing with Browser Windows. 
	 * A Browser Window is a square box in which a browser generally displays web pages. 
	 * In order to work with the Web Elements on any Browser Pop-up Window, we have to first switch to the pop-up 
	 * in Selenium and then locate the respective web elements inside the pop-up window. 
	 * NoSuchWindowException WebDriver Exception occurs when the driver in the Selenium Program 
	 * code is unable to find the pop-up window on the web page to switch to. i.e., when the driver is
	 *  switching to an invalid or non-existent pop-up window.
	 *  
	 * 4. NoAlertPresentException-->
	 * Alert is a type of pop-up that pops up to provide important information to users. To work with Alert pop-ups, 
	 * we have to first switch to Alert and then perform operations on Alert, like reading the messages on the 
	 * Alerts or Accepting the alert by pressing the 'OK' button on the alert, etc. NoAlertPresentException WebDriver Exception 
	 * occurs when the driver in the Selenium Program code is unable to find the Alert on the web page to switch. 
	 * i.e., when the driver is switching to an invalid or non-existing Alert pop-up. 
	 * 
	 * 
	 * 
	 *  5. SessionNotFoundException-->
	 *  This Exception occurs when a driver is trying to perform operations on the Web Application after the Browser is closed. 
	 *  It typically happens when your WebDriver session has been terminated but your code is still trying to interact with it.
	 *  
	 *  Handling Strategies:
	 *  Always use try-finally blocks to ensure proper driver quitting
	 * 
	 * 
	 * 
	 * 
	 * 5. StaleElementReferenceException-->
	 * 
	 * StaleElementReferenceException WebDriver Exception occurs mainly because of page navigations between 
	 * the execution of Selenium code. i.e. This exception occurs when Selenium navigates to a different page,
	 *  comes back to the same old page, and performs operations on the old page.
	 * 
	 *  7. TimeOutException-->
	 * 
	 * This exception happens when a command takes longer to complete than the wait time. 
	 * Waits are mostly utilized in WebDriver to avoid the ElementNotVisibleException error.
	 * 
	 * Handling Strategies:
	 * Adjust wait times based on application performance
	 * Use dynamic waits with appropriate conditions
	 * 
	 * 
	 * 
	 * **/
	
	
	
	/*
	 * 
🧠 When to Use What?
Use Case	Use
You want to handle the error in the same method	try-catch
You want to pass the responsibility to the caller	throws
You want to manually create and throw an exception	throw
	 * 
	 * 
	 * 
	 * when to use try-catch and when to use throws and threo
	 * 
	 * 
	 * 
	 * */
	
	/*How to handle 'staleElementRefernceExcption'-->
	 * 
	 * how to handle this? 5. StaleElementReferenceException-->
	 * 
	 * 1. Use Explicit Wait-->
	 * DOM reload या element re-render होने का wait करो और फिर element को use करो।
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 * WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
	 * element.sendKeys("Shyam");
	 * 
	 * 
	 * 
	 * 2.Avoid Storing WebElements for Long-->
	 * अगर DOM बार-बार बदलता है (SPA apps, Angular/React apps), तो WebElements को instance
	 * variable में store करने के बजाय direct locator से call करो।
	 * 
	 * 
	 * ❌ Wrong way:
	 * WebElement button = driver.findElement(By.id("loginBtn"));
	 * button.click(); // may fail after page refresh
	 * 
	 * ✔ Correct way:
	 * driver.findElement(By.id("loginBtn")).click();
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

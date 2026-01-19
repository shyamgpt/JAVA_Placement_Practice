package Notes_2025_June;

public class HandleAjaxCall_inSelenium {

	
	//Url --https://www.youtube.com/watch?v=o8RPM4iIL4A&list=PLsjUcU8CQXGGN9HNbnHX513Q9bclOyAqv&index=37
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebDriver wait  = new WebDriverWait(driver,30);
		
		WebElement facebookOption = wait.until(ExpectedCondition.visiblityOfElementLoacted(By.linkText("FaccBook")));
		
		facebookOption.click();
		
		driver.findElement(By.className("dropbtn")).click();

	}
	
	/*Web Pages make ajax call, to retrieve small amount of data from server
	 * without reloading the entire webpage.
	 * Eg of Ajax call -->
	 * Selenium WebDriver handles Ajax call using waiting mechanism
	 * 1. Implicit wait
	 * 2. Explicit wait
	 * 3. Fluent wait etc.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

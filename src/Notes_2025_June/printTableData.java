package Notes_2025_June;

public class printTableData {

	/*
	 * 
	 * tr --> Table row th --> Table Heading td --> Table data
	 * 
	 * 
	 * 1--> To print particular values(data) in the table:
	 * 
	 * Xpath for Table for particular row-->
	 * 
	 * ".//*[@id='content']/table/tbody/tr[2]/td[2]"
	 * 
	 * 
	 * 2--> To print all data’s in the table:
	 * (Read the selenium Notes-->)
	 * file:///C:/Users/shyam/OneDrive/Desktop/Selenium_Job_2025/Selenium_Notes%20full%20material.pdf
	 * WebDriver driver = new FirefoxDriver();
	 * driver.get("http://toolsqa.com/automation-practice-table/"); 
	 * List<WebElement>tRows = driver.findElements(By.tagName("tr")); 
	 * for(int i=0;i<tRows.size();i++){ 
	 * List<WebElement> tData =driver.findElements(By.tagName("td")); 
	 * for(int j=0;j<tData.size();j++){
	 * System.out.println(tData.get(j).getText());
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

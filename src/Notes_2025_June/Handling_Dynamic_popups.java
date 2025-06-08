package Notes_2025_June;

public class Handling_Dynamic_popups {
	
	//https://www.youtube.com/watch?v=F2KLAvyVhwM

	/**
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * public void test() {
	 * 
	 * // 1. Using Expected Condition
	 * 
	 * try {
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 60);
	 * 
	 * if(wait.untill(ExpectedConditon.alertIsPresent())==null)
	 * System.out.println("Alert is not displayed");
	 * 
	 * }
	 * 
	 * else{
	 * 
	 * 
	 * driver.switchTo().alert().accept();
	 * 
	 * OR
	 *
	 * driver.switchTo().alert().dismiss(); 
	 * 
	 * 
	 * }
	 * 
	 * // 2.  User alert class direclty
	 * 
	 * try{
	 *  Alert alert = driver.switchTo().alert();
	 *  
	 *  alert.accept();
	 * 
	 * }catch(NoAlertPresentException ne){
	 * 
	 * System.out.println("Alert not displayed");
	 * ne.printStackTrace();
	 * }
	 * 
	 * 
	 *  // 3. Using GetWindowHandles()-->
	 *  
	 *  Set<String> wids = driver.getWindowHandles();
	 *  
	 *  if(wids.size()>1){
	 *  
	 *  driver.switchTO().window("give name or window handle");
	 *  
	 *  try{
	 *   WebElement elementOnPopup= driver.findElement(By.id("test"));
	 *   
	 *   if(elementOnPopup.isDisplayed()){
	 *   elementOnPopup.clikck();
	 *   
	 *   }catch(NoSuchElementException ne)
	 *  
	 *  
	 *  }else{
	 *  
	 *  System.out.println("Alerts is not displayed");
	 *  }
	 *  
	 *  }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * / /** Normal popup--> Normal Popup [confirmation message / Alerts] is
	 * designed such that it will be displayed Every time as per the bussiness
	 * requirements
	 * 
	 * Dynamic popup--> Normal Popup [confirmation message / Alerts] is designed
	 * such that it will be displayed Sometime and we are not sure the popup will be
	 * displayed. -This depends upon the internal bussiness logic and internal
	 * implementation.
	 * 
	 * 
	 * Hwo to handle in automation-->
	 * 
	 * 1. Check if the Popup is displayed on the UI 2. If Yes => Click on OK or
	 * Accept or Yes button 3. If No=> Move and Execute next Step
	 */
}

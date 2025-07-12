package Notes_2025_June;
import org.openqa.selenium.NoSuchElementException;

public class isElementDisplayed {
	
	  public static boolean isElementPresent(WebElement webElement) {
	        try {
	            boolean isPresent = webElement.isDisplayed();
	            return isPresent;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	        
	    }

}

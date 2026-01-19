package Notes_2025_June;

public class Dynamic_WebElement_With_Changing_ID_Attribute {
	
	
	//How to handle dynamic web elements in Selenium , With changing ID and Attribute?
	//https://www.youtube.com/watch?v=H1_rmdsZ4gI
	
	/**
	 * What does it means?
	 * Dynamic webElement are those webElement whose attribute keeps on changing (may be it's id or class etc)
	 * 
	 * Ways of handling Dynamics WebElements -->
	 * Using contains
	 * Using start-with
	 * Using Xpath Axes
	 * Using Text
	 * Using Indexes
	 * Using end-with
	 * etc
	 * 
	 * 
	 * 1. Using Contains method -->
	 * 
	 * Keep the id which is fixed/constant and do not keep which is keep on chnaging
	 * 
	 *(//button[contains(@id,'u_0_5_')])  and Id = u_0_5_D7 (D7 parts keep on changing)
	 *
	 *2. Using strat-with-->
	 *
	 *(//button[starts-with(@id,'u_0_5_')])
	 *
	 *
	 *3. Using Xpath Axes-->
	 *
	 *Parent xpath//child xpath
	 *
	 *(//form[@data-testid='royal_login_form']/descendant::button)
	 *
	 *4. Using Text -->
	 * 
	 * (//button[contains(text(),'Log in')])
	 * 
	 * 5. Using indexes -->
	 * (//button[1])
	 * 
	 * */

}

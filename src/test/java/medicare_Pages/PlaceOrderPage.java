package medicare_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	
	@FindBy(linkText="Orders")
	WebElement orderlink;
	
	
	public PlaceOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void click_orderPage()
	{
		orderlink.click();
		
	}

}
package medicare_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import medicare_Base.*;
public class HomePage extends Base {
	
	@FindBy(xpath="//div[@class='container mt-3 bg-success']/descendant::p[1]")
	WebElement text;
	
	@FindBy(linkText="New User? Register Here")
	WebElement registerLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public String getURL_page()
	{
		String URLnew = driver.getCurrentUrl();
		return URLnew;
	}
	
	public String Validate_Text_On_Page()
	{
		String pageText = text.getText();
		System.out.println(pageText);
		return pageText;
	}
	
	public void click_register_link()
	{
		registerLink.click();
	}
	
	

}
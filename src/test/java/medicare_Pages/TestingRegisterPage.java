package medicare_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import medicare_Base.*;

public class TestingRegisterPage extends Base{
	
	@FindBy(xpath="//input[@id='name']")
	WebElement registername;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement registeremail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement registerpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement registerBtn;
	
	@FindBy(xpath="/html/body/div[2]/div/p[3]")
	WebElement userText;
	
	
	public TestingRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void register_user()
	{
		registername.sendKeys("shridhar");
		registeremail.sendKeys("shridhar@gmail.com");
		registerpassword.sendKeys("shri@123");
		registerBtn.click();
	}
	
	public String validate_registration_URL()
	{
		String register_url = driver.getCurrentUrl();
		return register_url;
	}
	
	public String validate_registration_Text()
	{
		String user_name = userText.getText();
		return user_name;
	}
	
	
	
	
	
	
	
	
	
	

}
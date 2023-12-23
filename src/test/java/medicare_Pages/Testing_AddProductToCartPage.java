package medicare_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing_AddProductToCartPage {
	
	
	@FindBy(xpath="//a[@id=\"product102\"]")
	WebElement viewMadiceneBTN;
	
	@FindBy(xpath = "//a[@id='cart102']")
	WebElement addtocartBTN;
	
	@FindBy(xpath="//div[@class='alert alert-success']/descendant::p[1]")
	WebElement successText;
	
	JavascriptExecutor executor;
	
	public Testing_AddProductToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		executor = (JavascriptExecutor) driver;
		
	}
	
	public void add_product_to_cart() throws InterruptedException
	{
		
		
		executor.executeScript("arguments[0].click();", addtocartBTN);
	
	
	}
	
	public String validate_success_message()
	{
		
		String successtext = successText.getText();
		return successtext;
		
	}
}
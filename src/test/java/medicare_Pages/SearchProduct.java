package medicare_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchProduct {
	@FindBy(id = "search-product")
	WebElement Search;
	@FindBy(id = "search-product-button")
	WebElement Submit;
	public SearchProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Search() {
		//Search.click();
		Search.sendKeys("Limcee Chewable Tablet Orange");
		Submit.click();
	}
}

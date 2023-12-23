package medicare_Pages_Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import medicare_Base.*;
import medicare_Pages.*;

public class AddProductToCartTest extends Base {
	
	HomePage hp;
	TestingRegisterPage rp;
	TestingLoginPage lp;
	Testing_AddProductToCartPage ac;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new TestingRegisterPage(driver);
		lp = new TestingLoginPage(driver);
		ac = new Testing_AddProductToCartPage(driver);
	}
	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	

	@Test(priority='2')
	public void test_add_product_to_cart() throws InterruptedException
	{
		ac.add_product_to_cart();
	}
	
	@Test(priority='3')
	public void test_validate_success_message()
	{
		String expected = "Message:Product Hamdard Safi Natural Blood Purifier Syrup Added Successfully to Cart";
	String actualText=	ac.validate_success_message();
	Assert.assertEquals(actualText, expected);
	}



}
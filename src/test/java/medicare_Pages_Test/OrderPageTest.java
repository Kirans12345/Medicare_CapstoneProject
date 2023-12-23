package medicare_Pages_Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import medicare_Base.*;
import medicare_Pages.*;

public class OrderPageTest  extends Base {
	
	HomePage hp;
	TestingRegisterPage rp;
	TestingLoginPage lp;
	PlaceOrderPage op;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new TestingRegisterPage(driver);
		lp = new TestingLoginPage(driver);
		op = new PlaceOrderPage(driver);
	}

	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	
	@Test(priority='2')

	public void test_click_orders()
	{
		op.click_orderPage();
	}

	
	@Test(priority='3')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/orders";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}
	
}
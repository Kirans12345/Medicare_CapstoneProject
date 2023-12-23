package medicare_Pages_Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import medicare_Base.*;
import medicare_Pages.*;


public class LoginPageTest extends Base {
	
	HomePage hp;
	TestingRegisterPage rp;
	TestingLoginPage lp;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new TestingRegisterPage(driver);
		lp = new TestingLoginPage(driver);
	}

	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}

	
	@Test(priority='2')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/login";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}
	
@Test(priority='3')
	
	public void Test_validate_registration_Text()
	{
		String expected = "Hello shridhar !";
		String actualText = rp.validate_registration_Text();
		Assert.assertEquals(actualText, expected);
	}


@Test(priority='4')

public void test_click_cart()
{
	lp.click_cart();
}


}
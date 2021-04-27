package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.LoginPage;
import page.WelcomePage;
import util.BrowserFactory;


public class LoginTest {
	
	WebDriver driver;
	
	@Test
	
	@Parameters({"userid","Password"})
	
	public void loginTest(String userId, String password) {
		
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.enterUserId(userId);
		
		loginpage.enterPassword(password);
		
		loginpage.clickSignInButton();
		
		WelcomePage welcomepage =PageFactory.initElements(driver, WelcomePage.class);
		
		welcomepage.validateWelcomePage();
		
		//BrowserFactory.tearDown();
		
		
		
	}

}

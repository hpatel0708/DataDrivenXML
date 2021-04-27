package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.FindReservationPage;
import page.LoginPage;
import util.BrowserFactory;


public class FindReservationTest {

	WebDriver driver;

	

	String userId = null;

	String password = null;

	String LastName = null;

	String FirstName = null;

	String status = null;

	String roomtype = null;
	
	@Test

	public void userShouldBeAbleToFindReservation() {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.enterUserId(userId);

		loginpage.enterPassword(password);

		loginpage.clickSignInButton();

		FindReservationPage findreservation = PageFactory.initElements(driver, FindReservationPage.class);

		findreservation.clickOnFindButton();

		findreservation.clickOnReservationButton();

		findreservation.enterLastName(LastName);

		findreservation.enterFirstName(FirstName);

		findreservation.statusField(status);

		findreservation.RoomTypeField(roomtype);

		findreservation.clickOnSearchButton();

		// driver = BrowserFactory.tearDown();

	}

}

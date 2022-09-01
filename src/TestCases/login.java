package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Loginobjects;
import Objects.dashboard;

public class login {
	String emailOfUser = "divy677@yopmail.com";
	String Pass = "Test@123";
	WebDriver driver;
	@BeforeTest
	public void BeforeTesting()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\samee\\OneDrive\\Desktop\\Selenium_setup\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev.quick-connect.io");
	}
	
	@Test(priority =1 ) 
	public void LoginUser() throws InterruptedException {
		Loginobjects lp = new Loginobjects(driver);
		lp.UserEmail().sendKeys(emailOfUser);
		lp.UserPassword().sendKeys(Pass);
		lp.Login().click();
		Thread.sleep(2000);
		
	}
	@Test(priority=2)
	public void TotalReadUnreadMessagesOfWeb() throws InterruptedException {
		dashboard db = new dashboard(driver);
		db.Dropdown().click();
		db.Web().click();
		Thread.sleep(2000);
		db.Read().click();
		db.UnRead().click();
		db.Total().click();
		
	}
	@Test(priority=3)
	public void TotalReadUnreadMessagesOfWhatsapp() throws InterruptedException {
		dashboard db = new dashboard(driver);
		db.Dropdown().click();
		db.Whatsapp().click();
		Thread.sleep(2000);
		db.Read().click();
		db.UnRead().click();
		db.Total().click();
	}
	@Test(priority=4)
	public void TotalReadUnreadMessageOfFacebook() throws InterruptedException {
		dashboard db = new dashboard(driver);
		db.Dropdown().click();
		db.Facebook().click();
		Thread.sleep(2000);
		db.Read().click();
		db.UnRead().click();
		db.Total().click();
	}

}


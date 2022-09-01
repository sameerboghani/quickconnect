package TestCasse2;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import Objects.InboxObject;
	import Objects.Loginobjects;

	public class InboxSection {
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
		
		@Test(priority =2)
		public void AccessTheInbox() throws InterruptedException {
			InboxObject io = new InboxObject(driver);
			driver.get("https://dev.quick-connect.io/inbox");
			Thread.sleep(3000);
		
		}
		@Test(priority =3)
		public void AccessTheChatSection() throws InterruptedException {
			InboxObject io = new InboxObject(driver);
			Thread.sleep(2000);
			io.ChatSections().click();
		}
		@Test(priority=4)
		public void AccessTheUnreadSection() throws InterruptedException {
			InboxObject io = new InboxObject(driver);
			Thread.sleep(2000);
			io.Unread().click();
		}
		@Test(priority=5)
		public void AccessTheActiveSection() throws InterruptedException {
			InboxObject io = new InboxObject(driver);
			Thread.sleep(2000);
			io.Active().click();
		}
		@Test(priority=6)
		public void AccessTheArchiveSection() throws InterruptedException {
			InboxObject io = new InboxObject(driver);
			Thread.sleep(2000);
			io.Archive().click();
		}
	}
	




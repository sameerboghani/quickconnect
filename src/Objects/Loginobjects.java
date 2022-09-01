package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginobjects {

		WebDriver driver;
		
		By email = By.xpath("(//input[@aria-invalid=\"false\"])[01]");
		By password = By.xpath("(//input[@aria-invalid=\"false\"])[02]");
		By loginButton = By.xpath("//button[@type='submit']");
		
		
		public Loginobjects(WebDriver driver) {
			this.driver=driver;
		}
		
		public WebElement UserEmail() {
			return driver.findElement(email);
		}
		public WebElement UserPassword() {
			return driver.findElement(password);
			
		}
		public WebElement Login() {
			return driver.findElement(loginButton);
		}
	}





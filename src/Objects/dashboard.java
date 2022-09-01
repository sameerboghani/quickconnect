package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboard {
	
	WebDriver driver;
	
	By DropDown = By.xpath("(//div[@role=\"button\"])[17]");
	By Web = By.xpath("//li[@data-value=\"WEB\"]");
	By Whatsapp = By.xpath("//li[@data-value=\"Whatsapp\"]");
	By Facebook = By.xpath("//li[@data-value=\"Facebook\"]");
	By Read = By.xpath("//button[@value=\"ReadMessage\"]");
	By Unread =By.xpath("//button[@value=\"UnReadMeassage\"]");
	By Total = By.xpath("//button[@value=\"total\"]");
	
	
	public dashboard(WebDriver driver) {
		this.driver= driver;
	}
	public WebElement Dropdown() {
		return driver.findElement(DropDown);
	}
	public WebElement Web() {
		return driver.findElement(Web);
	}
	public WebElement Whatsapp() {
		return driver.findElement(Whatsapp);
	}
	public WebElement Facebook() {
		return driver.findElement(Facebook);
	}
	public WebElement Read() {
		return driver.findElement(Read);
	}
	public WebElement UnRead() {
		return driver.findElement(Unread);
	}
	public WebElement Total() {
		return driver.findElement(Total);
	}

}
package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InboxObject {
	WebDriver driver;
	
	By InboxSection = By.xpath("(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig\"])[02]");
	By ChatSection =By.xpath("(//button[@type=\"button\"])[01]");
	By Unread = By.xpath("(//button[@type=\"button\"])[02]");
	By Active =By.xpath("(//button[@type=\"button\"])[03]");
	By Archive =By.xpath("(//button[@type=\"button\"])[04]");
	
	public InboxObject(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Inbox() {
		return driver.findElement(InboxSection);
	}
	public WebElement ChatSections() {
		return driver.findElement(ChatSection);
	}
	public WebElement Unread() {
		return driver.findElement(Unread);
	}
	public WebElement Active() {
		return driver.findElement(Active);
	}
	public WebElement Archive() {
		return driver.findElement(Archive);
	}
}

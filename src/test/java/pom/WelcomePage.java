package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	// initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// declaration
	@FindBy(xpath =  "//a[text()='Register']")
	private WebElement registerLink;
	
	@FindBy(linkText =  "Log in")
	private WebElement loginLink;
	
	// getters
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
}

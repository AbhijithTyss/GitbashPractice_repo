package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
//		wp.getRegisterLink().click();
		wp.getLoginLink().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("abhis1234@gmail.com");
		lp.getPasswordTextField().sendKeys("abhis@1234");
		lp.getLoginButton().click();
	}
}

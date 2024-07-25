package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement customeGender = driver.findElement(By.name("custom_gender"));
//		System.out.println(customeGender.isDisplayed());
		WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']/..//input"));
		System.out.println(custom.isSelected());
		custom.click();
		System.out.println(custom.isSelected());
//		System.out.println(customeGender.isDisplayed());
	}
}
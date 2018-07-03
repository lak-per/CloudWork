package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1SLoginPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='email']")
	WebElement EmailAddress;

	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//input[@name='Submit']")
	WebElement Submit;

	public A1SLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Login() {

		EmailAddress.sendKeys("cloudqauserseven@gmail.com");
		Password.sendKeys("cloudQA7");
		Submit.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}

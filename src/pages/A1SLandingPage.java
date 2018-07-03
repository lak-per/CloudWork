package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1SLandingPage {

	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Design/Quote')]")
	WebElement DesignQuote;

	@FindBy(xpath = "//a[contains(text(), 'A1S Cloud Services']")
	WebElement A1SCloudServices;

	public A1SLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToCloud() {
		Actions action = new Actions(driver);
		action.moveToElement(DesignQuote).build().perform();
		action.moveByOffset(0, 100).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}

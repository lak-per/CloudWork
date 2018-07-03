package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1SLandingPage {

	@FindBy(xpath = "//a[contains(text(),'Design/Quote')]")
	WebElement DesignQuote;

	@FindBy(xpath = "//a[contains(text(), 'A1S Cloud Services']")
	WebElement A1SCloudServices;

	public A1SLandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void navigateToCloud() {

		DesignQuote.click();
		A1SCloudServices.click();
	}
}

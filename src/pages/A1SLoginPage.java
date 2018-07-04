package pages;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Browsers;
import utils.ExcelUtils;

public class A1SLoginPage {

	WebDriver driver;
	String TempPath;
	XSSFWorkbook workbook;

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

	public void Login() throws Exception {

		ExcelUtils exUt = new ExcelUtils();
		TempPath = Browsers.getUserDir();
		TempPath = TempPath + "\\\\src\\\\dataEngine\\\\TestData.xlsx";
		workbook = exUt.InitFile(TempPath);
		EmailAddress.sendKeys(exUt.GetCellData("LoginData", 1, 0));
		Password.sendKeys(exUt.GetCellData("LoginData", 1, 1));
		Submit.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}

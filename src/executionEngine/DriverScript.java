package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import config.Browsers;
import pages.A1SLandingPage;
import pages.A1SLoginPage;

public class DriverScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String A1S_URL = "https://app8vo.avaya.com/ec/default.aspx";
		WebDriver driver = Browsers.InitDriver("Chrome");
		driver.get(A1S_URL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		A1SLoginPage objALoginP = new A1SLoginPage(driver);
		A1SLandingPage objALandingP = new A1SLandingPage(driver);

		objALoginP.Login();
		objALandingP.navigateToCloud();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		}
		driver.quit();
	}
}

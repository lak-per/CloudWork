package hpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAvayaLogin {

	public static void VPNHome(WebDriver driver) {

		try {
			driver.get("http://demo.guru99.com/test/radio.html");
			Thread.sleep(6000);
			driver.manage().window().maximize();
			String PageTitle = driver.getTitle();
			String CompString = "Avaya SSO Login";
			if (PageTitle.equals(CompString)) {

				WebDriverWait LoginWait = new WebDriverWait(driver, 30);
				LoginWait.until(ExpectedConditions.visibilityOfElementLocated(By
						.name("Submit")));

				driver.findElement(By.id("email")).sendKeys("hswaroopkato");
				driver.findElement(By.id("password")).sendKeys("Scarlett31");
				driver.findElement(By.xpath("//input[@name='Submit']")).click();

				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

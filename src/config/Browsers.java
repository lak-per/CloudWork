package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	private static WebDriver driver;

	public static WebDriver InitDriver(String browser) {
		initBrowser(browser);
		return driver;
	}

	private static void initBrowser(String browser) {
		switch (browser) {
		case "Chrome":
			launchChromeBrowser();
			break;
		case "Firefox":
			launchFireFoxBrowser();
			break;
		case "Explorer":
			launchExplorerBrowser();
			break;
		}
	}

	private static void launchChromeBrowser() {

		String filepath = getUserDir();
		filepath = filepath + "\\\\src\\\\Drivers\\\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", filepath);
		driver = new ChromeDriver();
		HandlingAvayaLogin.VPNHome(driver);
	}

	private static void launchFireFoxBrowser() {

		String filepath = getUserDir();
		filepath = filepath + "\\\\src\\\\Drivers\\\\geckodriver.exe";

		System.setProperty("webdriver.firefox.marionette", filepath);
		driver = new FirefoxDriver();
		HandlingAvayaLogin.VPNHome(driver);
	}

	private static void launchExplorerBrowser() {

		String filepath = getUserDir();
		filepath = filepath + "\\\\src\\\\Drivers\\\\IEDriverServer.exe";

		System.setProperty("webdriver.firefox.marionette", filepath);
		driver = new InternetExplorerDriver();
		HandlingAvayaLogin.VPNHome(driver);
	}

	private static String getUserDir() {
		String tempPath = System.getProperty("user.dir");
		return tempPath.replace("\\", "\\\\");
	}
}

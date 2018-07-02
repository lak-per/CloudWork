package hpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static WebDriver driver;

	public void initBrowser(String browser) {
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

	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hswaroopkato\\git\\CloudWork\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		HandlingAvayaLogin.VPNHome(driver);

	}

	public void launchFireFoxBrowser() {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\hswaroopkato\\git\\CloudWork\\src\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		HandlingAvayaLogin.VPNHome(driver);
	}

	public void launchExplorerBrowser() {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\hswaroopkato\\git\\CloudWork\\src\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		HandlingAvayaLogin.VPNHome(driver);

	}
}

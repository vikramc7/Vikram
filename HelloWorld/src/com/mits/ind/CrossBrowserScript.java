package com.mits.ind;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserScript {

	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * 
	 * @param browser
	 * @throws Exception
	 */
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vikra\\Downloads\\chromedriver_win32\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
		}
		// Check if parameter passed as 'IE'
		else if (browser.equalsIgnoreCase("ie")) {
			// set path to IE.exe
			System.setProperty("webdriver.ie.driver", ".\\IEDriverServer.exe");
			// create IE instance
			driver = new InternetExplorerDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		browser = "www.amazon.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException {
		driver.get("http://amazon.com");
		// Find user name
		WebElement userName = driver.findElement(By.name("uid"));
		// Fill user name
		userName.sendKeys("sindhu");
		// Find password
		WebElement password = driver.findElement(By.name("password"));
		// Fill password
		password.sendKeys("sindhu");
	}
}

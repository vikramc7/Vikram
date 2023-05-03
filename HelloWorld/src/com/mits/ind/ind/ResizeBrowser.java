package com.mits.ind;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.navigate().to("http://www.pavantestingtools.com");
		System.out.println(driver.manage().window().getSize());
		// Create object of Dimensions class
		Dimension d = new Dimension(480, 620);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}
}

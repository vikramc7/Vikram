package com.mits.ind;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigations {
	
	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("http://www.google.com");

	driver.navigate().to("http://www.amazon.com");
	
	//back and forward buttons simulation:
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	Thread.sleep(2000);

	driver.navigate().back();
	
	driver.navigate().refresh();

}
}

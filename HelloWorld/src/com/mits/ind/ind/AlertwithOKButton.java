package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertwithOKButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click(); // click
		// on
		// the
		// button

		Thread.sleep(5000);

		driver.switchTo().alert().accept(); // this will close alert box by
		// clicking OK button

	}
}
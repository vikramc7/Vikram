package com.mits.ind;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click(); // click on Go btn

		// driver.get("https://www.google.com");

		// driver.manage().

		// driver.findElement(By.className("gLFyf gsfi")).sendKeys("hello");

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct alert messg");
		} else {
			System.out.println("in-correct alert messg");
		}

		alert.accept(); // click on OK btn

		// alert.dismiss(); //click on cancel btn

	}

}

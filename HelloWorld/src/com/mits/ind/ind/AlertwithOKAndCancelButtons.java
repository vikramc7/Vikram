package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertwithOKAndCancelButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();// button1

		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click(); // button2

		Thread.sleep(5000);

		// close alert window by pressing OK button - first time
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click(); // button2
		Thread.sleep(5000);

		// close alert window by pressing Cacel button - second time time
		driver.switchTo().alert().dismiss();

	}

}
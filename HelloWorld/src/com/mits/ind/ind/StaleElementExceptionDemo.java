package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementExceptionDemo {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

		System.out.println("hjjhk");
	

		driver.get("https://www.google.co.in//"); // enter URL
		//driver.findElement(By.XPath('/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input'));

	}

}

package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

		System.out.println("hjjhk");

		  driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		  driver.manage().window().maximize(); // maximum browser window

		  JavascriptExecutor js = (JavascriptExecutor) driver;

		  // 1. scrolling by using pixel
		  js.executeScript("window.scrollBy(0,1000)", "");

		  // 2. scrolling page till we find element
		  WebElement flag = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		  js.executeScript("arguments[0].scrollIntoView();", flag);

		  // 3. scroll page till bottom
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  System.out.println("end");
		 }

	}


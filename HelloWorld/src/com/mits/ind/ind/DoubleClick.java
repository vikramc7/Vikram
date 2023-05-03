package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

  driver.get("http://api.jquery.com/dblclick/");

  Actions act = new Actions(driver);

  driver.switchTo().frame(0);

  WebElement ele = driver.findElement(By.xpath("/html/body/div"));

  // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
  // ele);// scroll down for the element

  String color = ele.getCssValue("color").toString();
  System.out.println("color before double click:" + color); // blue

  Thread.sleep(5000);
  act.doubleClick(ele).build().perform();

  Thread.sleep(2000);
  color = ele.getCssValue("color").toString();
  System.out.println("color after double click:" + color); // yellow

  driver.close();
 }
}
package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);

		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

		act.contextClick(button).build().perform(); // Right clcik on the button

		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click(); // copy

		System.out.println(driver.switchTo().alert().getText()); // capturing the text present on alert box

		driver.switchTo().alert().accept(); // close alert box

		driver.close();
		System.out.println("end");
	}

}

package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();

		WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement usermgnt = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		WebElement users = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));

		Actions act = new Actions(driver); // Actions class object

		// MouseHover action
		act.moveToElement(admin).moveToElement(usermgnt).moveToElement(users).click().build().perform();
		System.out.println("end");

	}

}
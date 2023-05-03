package com.mits.ind;

	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class XPathexample {
	
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			System.out.println("hi");

			
			ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(co); 

			System.out.println("hjjhk");
		

			driver.get("https://www.google.co.in//"); // enter URL

	//WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://login.yahoo.com/account/create");
	driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Your-Name"); // Will send values to First Name tab
	driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Your-Last_name");
	
	driver.findElement(By.xpath("//input[@id='usernamereg-userId']")).sendKeys("email@yahoo.com"); //xpath for email box
	System.out.println("hiiiiiiii");//xpath for last name box
	driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("123456789"); //xpath for phone number box
	driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click(); //xpath for usermonth box
	driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys("01"); //xpath for userday box
	driver.findElement(By.xpath("//input[@id='usernamereg-birthYear']")).sendKeys("1999");// xpath for user year"
	driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();// xpath for submit button
	
	
	driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("password");// xpath for user year
	

	
	}
	}
	
			
	
	

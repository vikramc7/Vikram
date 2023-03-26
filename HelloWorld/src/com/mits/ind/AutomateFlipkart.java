package com.mits.ind;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class AutomateFlipkart {

	public static WebDriver driver;

	public static String driverPath = "C:\\Users\\vikra\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe";

	private static final String sSearchResult = "//li[contains(text(),'in')]//span";

	private static final String sBookName = "(//a[contains(.,'Selenium')])[last()]";

	private static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";

	private static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";

	public static void initWebDriver(String URL) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

		driver.get(URL);

		driver.manage().window().maximize();

	}

	public static void main(String[] args) throws InterruptedException {

		initWebDriver("http://www.flipkart.com");

		flipkartLogin();

		driver.findElement(By.xpath("//div[@class='O8ZS_U']")).sendKeys("Selenium");

		WebElement searchResult = getElement(By.xpath(sSearchResult));

		searchResult.click();

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sBookName))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();

		getElement(By.xpath(sViewCartXPath)).click();

		getElement(By.cssSelector("form[id='view-cart-form'] button")).click();

		getElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("test@testmail.com");

		// pause for a second and close the browser.

		Thread.sleep(1000);

		endSession();

	}

	private static void endSession() {
		// TODO Auto-generated method stub

	}

	public static WebElement getElement(final By locator) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override

			public WebElement apply(WebDriver arg0) {

				return arg0.findElement(locator);

			}

		});

		return element;

	}

	public static void flipkartLogin() {

		getElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("user email or mobile number");

		getElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("password");

		getElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			// TBD: Auto-generated catch block.

			e.printStackTrace();

		}

	}

}

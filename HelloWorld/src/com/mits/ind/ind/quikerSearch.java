package com.mits.ind;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class quikerSearch {

public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	System.out.println("hi");

	
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co); 

	System.out.println("hjjhk");
driver.get("http://www.quikr.com/maruti-suzuki-cars-cars/maruti-suzuki-cars/z71");
driver.findElement(By.xpath("//*[@id='modal-citypopup-close']")).click();
List <WebElement> elements=driver.findElements(By.xpath("//*[@id='products']/div/div[2]/div/div[1]/div/div[2]/span"));
for(int i=0;i<elements.size();i++){
String value=elements.get(i).getText().replaceAll(",", "").replaceAll("[^A-Za-z0-9,]", "").replaceAll("AskForPrice", "");
//int a=Integer.valueOf(value);
//Long a=Long.valueOf(value);
//System.out.println("Value is :"+a);
System.out.println(elements.get(i).getText().replaceAll(",", "").replaceAll("[^A-Za-z0-9,]", "").replaceAll("AskForPrice", ""));

}
}
}
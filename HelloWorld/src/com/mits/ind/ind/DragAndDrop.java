package com.mits.ind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikra\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		System.out.println("hi");

		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co); 

		System.out.println("start");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement target = driver.findElement(By.xpath("//*[@id='box106']"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform(); // First method 
		act.dragAndDrop(source, target).build().perform(); // Second method
		System.out.println("end");
		 }
	}


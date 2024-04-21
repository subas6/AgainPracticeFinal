package com.October11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {
public static void main(String[]args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");		
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
WebElement username=driver.findElement(By.id("username"));
username.sendKeys("admin");
Thread.sleep(2000);
username.clear();
Thread.sleep(2000);
username.sendKeys("admin123");

		
	}

}

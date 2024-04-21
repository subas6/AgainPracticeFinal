package com.October12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributevalue {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin123");
		String value=username.getAttribute("value");
		System.out.println(value);
		Thread.sleep(2000);
		driver.quit();
}
}
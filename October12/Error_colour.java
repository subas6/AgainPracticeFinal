package com.October12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error_colour {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		WebElement error=driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
		String errormsg=error.getCssValue("color");
		System.out.println(errormsg);
		driver.quit();
	}
}

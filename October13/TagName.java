package com.October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		System.out.println(username.getTagName());
		WebElement username1=driver.findElement(By.id("forgotPasswordFormContainer"));
		System.out.println(username1.getTagName());
		driver.quit();
}
}
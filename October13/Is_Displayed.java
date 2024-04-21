package com.October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement password=driver.findElement(By.name("pwd"));
		System.out.println(password.isDisplayed());
		WebElement id=driver.findElement(By.id("loginFormContainer"));
		System.out.println(id.isDisplayed());
		WebElement id1=driver.findElement(By.id("forgotPasswordFormContainer"));
		System.out.println(id1.isDisplayed());
		
	}

}

package com.October13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AriaRole {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String role=driver.findElement(By.id("keepLoggedInCheckBox")).getAriaRole();
		System.out.println(role);
		Thread.sleep(2000);
		String role2=driver.findElement(By.id("toPasswordRecoveryPageLink")).getAriaRole();
		System.out.println(role2);
		Thread.sleep(2000);
		driver.quit();
}
}
package com.October12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		WebElement error=driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
		String font=error.getCssValue("font");
		System.out.println(font);
		String actual="Username or Password is invalid. Please try again.";
		String expected=error.getText();
		if(actual.equals(expected))
		{
			System.out.println("Tc is passed");
		}
		else
		{
			System.out.println("Tc is failed");
		}
}
}